package screenmatch.main;

import java.util.ArrayList;

import screenmatch.models.Movie;
import screenmatch.models.Serie;
import screenmatch.models.Titles;

public class Lists {

    public static void main(String[] args) {
        Movie movie = new Movie("O Poderoso Chefão", 1972);
        var anotherMovie = new Movie("Avatar: The way of the water",2023 );
        Serie serie = new Serie("The Grand Tour", 2015);

        ArrayList<Titles> contentList = new ArrayList<>();
        contentList.add(movie);
        contentList.add(anotherMovie);
        contentList.add(serie);
        for( Titles item: contentList){
            System.out.println(item);
        }
    }
}
