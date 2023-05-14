package org.dstu.domain;

public class Bird extends Animal {
    private Boolean isFlying;
    private Boolean isMigrating;


    public Bird() {
    }

    public Bird(String[] line) {
        super(
                line[1],
                line[2],
                line[3],
                line[4]
        );
        try {
            isFlying = Boolean.parseBoolean(line[5]);
            isMigrating = Boolean.parseBoolean(line[6]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка при чтении из файла");
        }
    }

    @Override
    public String toString() {
        return "Птица: " + super.toString() +
                " | Летающая: " +
                isFlying +
                " | Мигрирущая: " +
                isMigrating;
    }
}
