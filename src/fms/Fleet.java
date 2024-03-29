package fms;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fleet {

    private final ArrayList<Freighter> freighters;

    public Fleet(ArrayList<Freighter> freighters) {
        this.freighters = freighters;
    }

    public ArrayList<Freighter> getFreighters() {
        return freighters;
    }


    public int getNumberOfShipsLaunchedAfter(LocalDate date) {
        int numberOfShips = 0;

        for (Freighter ship : freighters) {
            if (ship.getLaunchDate().compareTo(date) > 0) {
                numberOfShips++;
            }
        }
        return numberOfShips;
    }

    public int getTotalDeadWeightTonnage() {
        int totalDWT = 0;

        for (Freighter ship : freighters) {
            totalDWT += ship.getDeadWeightTonnage();
        }

        return totalDWT;
    }

    public Freighter getFreighterByName(String name) {

        for (Freighter freighter : freighters) {

            if (freighter.getName().equals(name)) {
                return freighter;
            }

        }
        return null;
    }

    public void removeFreighter(String name) {
        freighters.remove(getFreighterByName(name));
    }

    public int getNumberOfFreighters() {
        return freighters.size();
    }

    public int getTotalDeadWeightTonnageWithStatus(Status status) {
        int DWT = 0;
        for (Freighter freighter :
                freighters) {
            if (freighter.getStatus() == status) {
                DWT += freighter.getDeadWeightTonnage();
            }
        }

        return DWT;
    }

    public int getContainerCountWithStatus(Status status) {
        int containerCount = 0;
        for (Freighter freighter :
                freighters) {

            if (freighter.getClass() == ContainerShip.class) {
                if (freighter.getStatus() == status) {
                    containerCount += ((ContainerShip)freighter).getContainerCount();
                }
            }
        }

        return containerCount;
    }
}
