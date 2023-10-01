package Main;

import Domain.Models.Movie;
import Domain.Models.Serie;
import Domain.Models.Title;

import java.util.*;

public class MainWithList {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 1970);
        Movie othorMovie = new Movie("Avatar", 2023);
        Serie lost = new Serie("Lost", 2000);

        List<Title> list = new ArrayList<>();

        list.add(myMovie);
        list.add(othorMovie);
        list.add(lost);

        for (Title item: list) {
            System.out.println(item.getName());
        }

        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println(list);
    }
}
