package screenmatch.main;
import screenmatch.calculations.TimeCalculator;
import screenmatch.models.Movie;
import screenmatch.models.Serie;

import java.net.NetPermission;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> contentList = new ArrayList<>();
        
        //Cria a classe de tipo filme
        Movie movie = new Movie("O Poderoso Chefao", 1972);
        //Permite criar outro objeto do tipo filme, sem "repetir" a variavel Filme
        var anotherMovie = new Movie("Avatar: The way of the water",2023 );
        var oneMoreMovie = new Movie("Nemo", 2003);

        movie.setDurationInMinutes(175);
        movie.setIncludedInPlan(true);

        movie.rate(8);
        movie.rate(7.5);
        movie.rate(10);

        //limita meida para 2 casas decimais
        //System.out.printf("%.2f%n", movie.getmediaRating());

        anotherMovie.setDurationInMinutes(180);
        anotherMovie.setIncludedInPlan(false);

        anotherMovie.rate(10);
        anotherMovie.rate(7);
        anotherMovie.rate(10);

        //System.out.printf("%.2f%n",anotherMovie.getmediaRating());

        oneMoreMovie.setDurationInMinutes(101);
        oneMoreMovie.setIncludedInPlan(true);

        oneMoreMovie.rate(9);
        oneMoreMovie.rate(9);
        oneMoreMovie.rate(8);

        //System.out.printf("%.2f%n", oneMoreMovie.getmediaRating());

        contentList.add(movie);
        contentList.add(anotherMovie);
        contentList.add(oneMoreMovie);

        for(Movie item : contentList){
                System.out.println("Nome: " + item.getName());
                if(item instanceof Movie movies && movies.getmediaRating() > 2){
                        System.out.println("Classificaçao: " + movies.getmediaRating() + "\n");
                }
        }

        Serie serie = new Serie("The Grand Tour", 2015);
        serie.setMinutesPerEpisode(71);
        serie.setSeasons(6);
        serie.setEpisodesPerSeason(8);
        serie.setIncludedInPlan(true);

        serie.displayData();


        TimeCalculator calculator = new TimeCalculator();
        calculator.add(movie);
        calculator.add(anotherMovie);
        System.out.println("\nTempo total de filmes: " + calculator.getTotalTime());


        contentList.add(movie);
        contentList.add(anotherMovie);
        System.out.println("Tamanho da Lista: " + contentList.size());
        System.out.println("Primeiro filme: " + contentList.getFirst().getName());
        System.out.println(contentList);
        

    }
}
