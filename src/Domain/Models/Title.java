package Domain.Models;

public class Title {

    // PROPERTIES

    private String name;
    private int releaseYear;
    private boolean includedInPlan;
    private double sumRatings;
    private int totalRatings;
    private int durationInMinutes;

    // METHODS

    public void toAssess(double note) {
        sumRatings += note;
        totalRatings ++;
    }

    public void showTechnicalSheet() {
        System.out.println("Movie name: " + this.name);
        System.out.println("Release year: " + this.releaseYear);
    }

    // GET AND SET

    public double getAverage() {
        return sumRatings / totalRatings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public double getSumRatings() {
        return sumRatings;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}
