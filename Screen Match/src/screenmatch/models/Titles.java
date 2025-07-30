package screenmatch.models;

public class Titles {

    private String name;
    private int yearOfRelease;
    private boolean includedInPlan;
    private double sumOfRate;
    private int totaOfRating;
    private int durationInMinutes;


    //vai exibir algo, não devolve nada para o programa
    public void displayData(){

        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + yearOfRelease);
        System.out.println("Duração em minutos: " + durationInMinutes);
        System.out.println("Incluído no plano: " + includedInPlan);
    }

    public Titles(String name, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    private double mediaRating(){
        return sumOfRate/totaOfRating;
    }

    public void rate(double grade){
        sumOfRate += grade;
        totaOfRating ++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotaOfRating(){
        return totaOfRating;
    }

    public double getmediaRating(){
        return mediaRating();
    }
}
