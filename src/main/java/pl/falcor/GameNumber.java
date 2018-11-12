package pl.falcor;

import java.util.Objects;

/**
 * Representation of number that should be determined by the interval from which game/guessing take place.
 *
 */

public class GameNumber {

    private int value;

    public GameNumber(int value) {
        this.value = value;
    }

    boolean isHigherThan(GameNumber providedNumber){
        return providedNumber.value > this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameNumber that = (GameNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "" + value;
    }
}