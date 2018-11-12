package pl.falcor;

import java.util.Random;

/**
 * Representation of integer numbers interval out of which guessing takes place.
 *
 */

public class Interval {

    private int celling;
    private int bottom;

    public Interval(int celling, int bottom) {
        this.celling = celling;
        this.bottom = bottom;
    }

    public int draw(){
        return new Random().nextInt(celling - bottom + 1) + bottom;
    }
}
