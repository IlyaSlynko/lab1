package org.dstu.domain;

public class Mammal extends Animal {
    private Boolean isUpright;
    private Boolean isSeasonHibernation;


    public Mammal() {
    }

    public Mammal(String[] line) {
        super(
                line[1],
                line[2],
                line[3],
                line[4]
        );
        try {
            isUpright =  Boolean.parseBoolean(line[5]);
            isSeasonHibernation = Boolean.parseBoolean(line[6]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка при чтении из файла");
        }
    }

    @Override
    public String toString() {
        return "Млекопитающее: " + super.toString() +
                " | Прямоходящее: " +
                isUpright +
                " | Впадающий в спячку: " +
                isSeasonHibernation;
    }

    public Boolean getUpright() {
        return isUpright;
    }

    public void setUpright(Boolean upright) {
        this.isUpright = upright;
    }

    public Boolean getPredator() {
        return isSeasonHibernation;
    }

    public void setIsSeasonHibernation(Boolean predator) {
        this.isSeasonHibernation = predator;
    }
}
