package Calculations;

import Domain.Interfaces.Classifiable;

public class RecommendationsFilter {

    // PROPERTIES

    private String recommendation;

    // METHODS

    public void filter(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4)
            System.out.println("It's one of my favorites at the moment");
        else if (classifiable.getClassification() >= 2)
            System.out.println("Very highly rated at the moment!");
        else
            System.out.println("Put it on your list to watch later");
    }
}
