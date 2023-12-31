package Domain.Models;

public class Serie extends Title {

    // PROPERTIES

    private int season;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    // CONSTRUCTOR

    public Serie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    // METHODS

    @Override
    public int getDurationInMinutes() {
        return this.season * this.episodesPerSeason * this.minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Serie name: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }

    // GET AND SET

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }
}
