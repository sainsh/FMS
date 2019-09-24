package fms;

import java.util.ArrayList;

public class Fleet {

    private final ArrayList<Freighter> freighters;

    public Fleet(ArrayList<Freighter> freighters) {
        this.freighters=freighters;
    }

    public ArrayList<Freighter> getFreighters() {
        return freighters;
    }
}
