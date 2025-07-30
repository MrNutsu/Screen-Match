package screenmatch.calculations;

import screenmatch.models.Movie;
import screenmatch.models.Serie;
import screenmatch.models.Titles;

public class TimeCalculator {

    private int totalTime;

    public int getTotalTime(){
        return totalTime;
    }

//    public void add(Movie m){
//        totalTime += m.getDurationInMinutes();
//    }
//
//    public void add(Serie s){
//        totalTime += s.getDurationInMinutes();
//    }

    public void add(Titles titles){
        this.totalTime += titles.getDurationInMinutes();
    }
}
