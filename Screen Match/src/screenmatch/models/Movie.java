package screenmatch.models;

import screenmatch.calculations.Stars;

//(extends) diz a classe (Movie) que ela "sabe fazer" tudo contido na classe (Titles)
public class Movie extends Titles implements Stars {
    private String director;

    public Movie(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public int getStar() {

        //(int) casting realizado para converter valor decimal em inteiro
        return (int) getmediaRating()/2;
    }

    @Override
    public String toString() {
        return "Filme :" + this.getName() + " (" + this.getYearOfRelease() + ")";
    }
}
