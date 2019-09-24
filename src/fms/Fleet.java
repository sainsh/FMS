package fms;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fleet {

    private final ArrayList<Freighter> freighters;

    public Fleet(ArrayList<Freighter> freighters) {
        this.freighters=freighters;
    }

    public ArrayList<Freighter> getFreighters() {
        return freighters;
    }


    public int getNumberOfShipsLaunchedAfter(LocalDate date) {
        int numberOfShips = 0;

        for (Freighter ship: freighters) {
            if(ship.getLaunchDate().compareTo(date) > 0){
                numberOfShips++;
            }
        }
        return numberOfShips;
    }
}
