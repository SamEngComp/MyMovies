package Domain.Models;

import Domain.Interfaces.Classifiable;

public class Movie extends Title implements Classifiable {

    // PROPERTIES

    public String getDirector() {
        return director;
    }

    // METHODS

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }

    // GET AND SET

    public void setDirector(String director) {
        this.director = director;
    }

    private String director;


}