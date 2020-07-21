package model;

import exceptions.OutOfMapException;

public class Treasure implements UsableOnMap {


    @Override
    public void doStep() throws OutOfMapException { // не двмгается

    }

    @Override
    public boolean isMovable() { //не двигается
        return false;
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public int Y() {
        return 0;
    }

    @Override
    public String toString() {
        return "К";
    }
}
