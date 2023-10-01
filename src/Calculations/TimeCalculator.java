package Calculations;

import Domain.Models.Title;
import Domain.Models.Movie;
import Domain.Models.Serie;

public class TimeCalculator {

    // PROPERTIES

    private int totalTimeInMin;

    // METHODS

    public void add(Title title) {
        System.out.println("Adding duration in min of: " + title.getName());
        this.totalTimeInMin += title.getDurationInMinutes();
    }

    // GET

    public int getTotalTimeInMin() {
        return this.totalTimeInMin;
    }
}
