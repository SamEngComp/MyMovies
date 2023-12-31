package Domain.Models;

import Domain.Interfaces.Classifiable;

public class Movie extends Title implements Classifiable {

    // PROPERTIES

    public String getDirector() {
        return director;
    }

    // CONSTRUCTOR

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    // METHODS

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }

    // GET AND SET

    public void setDirector(String director) {
        this.director = director;
    }

    private String director;


}