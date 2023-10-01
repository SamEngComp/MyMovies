package Domain.Models;

import Domain.Interfaces.Classifiable;

public class Episode implements Classifiable {

    // PROPERTIES

    private int number;
    private String name;
    private Serie serie;
    private int totalVies;

    // METHODS

    @Override
    public int getClassification() {
        if (this.totalVies > 100) return 4;
        else return 2;
    }

    // GET AND SET

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
