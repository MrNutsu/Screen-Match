import screenmatch.calculations.TimeCalculator;
import screenmatch.models.Movie;
import screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> movieList = new ArrayList<>();
        //Cria a classe de tipo filme
        Movie movie = new Movie("O Poderoso Chefão", 1972);

        //Permite criar outro objeto do tipo filme, sem "repetir" a variavel Filme
        var anotherMovie = new Movie("Avatar: The way of the water",2023 );

        movie.setDurationInMinutes(175);
        movie.setIncludedInPlan(true);

//        movie.displayData();
        movie.rate(8);
        movie.rate(7.5);
        movie.rate(10);
//        System.out.println(movie.getTotaOfRating());
//
//        //limita meida para 2 casas decimais
//        System.out.printf("%.2f%n", movie.getmediaRating());
//

        anotherMovie.setDurationInMinutes(180);
        anotherMovie.setIncludedInPlan(false);

//        anotherMovie.displayData();
        anotherMovie.rate(10);
        anotherMovie.rate(10);
        anotherMovie.rate(10);
//        System.out.println(anotherMovie.getTotaOfRating());
//
//        //limita meida para 2 casas decimais
//        System.out.printf("%.2f%n", anotherMovie.getmediaRating());
//
//        System.out.println("Estrelas filme 1: " + movie.getStar());
//        System.out.println("Estrelas filme 2: " + anotherMovie.getStar());

        movieList.add(movie);
        movieList.add(anotherMovie);
        System.out.println(movieList);

        Serie serie = new Serie("The Grand Tour", 2015);
        serie.setMinutesPerEpisode(71);
        serie.setSeasons(6);
        serie.setEpisodesPerSeason(8);
        serie.setIncludedInPlan(true);

        serie.displayData();


        TimeCalculator calculator = new TimeCalculator();
        calculator.add(movie);
        calculator.add(anotherMovie);
        System.out.println("\n Tempo total de filmes: " + calculator.getTotalTime());


    }
}
