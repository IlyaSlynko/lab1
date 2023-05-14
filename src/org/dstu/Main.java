package org.dstu;

import org.dstu.domain.Animal;
import org.dstu.domain.IAnimal;
import org.dstu.domain.Mammal;
import org.dstu.domain.Bird;
import org.dstu.util.CsvReader;
import org.dstu.util.SerializeUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You must specify data file name and serialize file name!");
            return;
        }

        String sourceFile = args[0];
        String binFile = args[1];

        List<String[]> strings = CsvReader.readCsvFile(sourceFile, ";");
        List<IAnimal> people = new ArrayList<>();
        for (String[] line: strings) {
            if (line[0].equals("0")) {
                people.add(new Mammal(line) {
                });
            } else {
                people.add(new Bird(line));
            }
        }

        people.forEach(System.out::println);

        SerializeUtils.serialize(people, binFile);
        List<IAnimal> newPersons = (List<IAnimal>) SerializeUtils.deserialize(binFile);
        System.out.println("Новые люди:");
        newPersons.forEach(System.out::println);
    }
}
