package Calculations;

import Domain.Models.Title;
import Domain.Models.Movie;
import Domain.Models.Serie;

public class TimeCalculator {

    // PROPERTIES

    private int totalTimeInMin;

    // METHODS

    public void add(Title title) {
        System.out.println("Adding duration in min of: " + title);
        this.totalTimeInMin += title.getDurationInMinutes();
    }

    // GET

    int getTotalTimeInMin() {
        return this.totalTimeInMin;
    }
}
