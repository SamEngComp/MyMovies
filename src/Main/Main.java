package Main;

import Calculations.RecommendationsFilter;
import Calculations.TimeCalculator;
import Domain.Models.Episode;
import Domain.Models.Title;
import Domain.Models.Movie;
import Domain.Models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + myMovie.getDurationInMinutes());

        myMovie.showTechnicalSheet();
        myMovie.toAssess(8);
        myMovie.toAssess(5);
        myMovie.toAssess(10);
        System.out.println("Total de avaliações: " + myMovie.getTotalRatings());
        System.out.println(myMovie.getAverage());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.showTechnicalSheet();
        lost.setSeason(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDurationInMinutes());

        Movie othorMovie = new Movie();
        othorMovie.setName("Avatar");
        othorMovie.setReleaseYear(2023);
        othorMovie.setDurationInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.add(myMovie);
        calculator.add(othorMovie);
        calculator.add(lost);
        System.out.println(calculator.getTotalTimeInMin());

        RecommendationsFilter filter = new RecommendationsFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViews(300);
        filter.filter(episode);
    }
}
