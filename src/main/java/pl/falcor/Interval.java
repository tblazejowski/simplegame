package pl.falcor;

import java.util.Random;

/**
 * Representation of integer numbers interval out of which guessing takes place.
 *
 */

public class Interval {

    private int celling;
    private int floor;

    public Interval(int floor, int celling) {
        this.celling = celling;
        this.floor = floor;
    }

    public GameNumber draw(){
        return new GameNumber(new Random().nextInt(celling - floor + 1) + floor);
    }

    @Override
    public String toString() {
        return String.format("from interval <%d, %d>", floor, celling);
    }
}