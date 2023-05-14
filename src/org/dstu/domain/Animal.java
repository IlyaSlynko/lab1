package org.dstu.domain;

public abstract class Animal implements IAnimal {
    private String name;
    private  String genus;
    private Integer age;
    private Boolean isMale;

    public Animal() {
    }

    public Animal(String genus, String name, Integer age, Boolean isMale) {
        this.genus = genus;
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public Animal(String genus,String name, String age, String isMale) {
        try {
            this.genus = genus;
            this.name = name;
            this.age = Integer.parseInt(age);
            this.isMale = Boolean.parseBoolean(isMale);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка при чтении из файла");
        }
    }

    @Override
    public String toString() {
        return "Genus: " + genus + " | Name: " + name + " | Age: " + age + " | Is Male: " + isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        this.isMale = male;
    }
}
