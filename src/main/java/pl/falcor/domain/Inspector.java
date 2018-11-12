package pl.falcor.domain;

public class Inspector {

    public static String inspect(GameNumber drawnNumber, GameNumber providedNumber) {

        StringBuilder result = new StringBuilder("Guessing result: ");
        if (drawnNumber.equals(providedNumber)) {
            result.append("Congratulations! You've guessed the drawn number.");
        } else if (drawnNumber.isHigherThan(providedNumber)) {
            result.append("Your bet is too high!");
        } else result.append("Your bet is too low!");
        return result.toString();
    }
}