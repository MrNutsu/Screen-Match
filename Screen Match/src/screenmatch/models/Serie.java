package screenmatch.models;

import screenmatch.calculations.Stars;

public class Serie extends Titles implements Stars {

    private int seasons;
    private int episodesPerSeason;
    private boolean inRelease;
    private int minutesPerEpisode;

    public Serie(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public boolean isInRelease() {
        return inRelease;
    }

    public void setInRelease(boolean inRelease) {
        this.inRelease = inRelease;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }


    //(Override) permite a sobrescrita de um metodo
    @Override
    public int getDurationInMinutes() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

    @Override
    public void displayData() {
        System.out.println("Nome da série: " + getName()); // ✅ Usando métodos herdados
        System.out.println("Ano de lançamento: " + getYearOfRelease());
        System.out.println("Duração total da série em minutos: " + getDurationInMinutes());
    }

    @Override
    public int getStar() {

        //(int) casting realizado para converter valor decimal em inteiro
        return (int) getmediaRating()/2;

    }
}
