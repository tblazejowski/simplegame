package pl.falcor.domain;

public class Inspector {

    public static StringBuilder message = new StringBuilder();

    public static boolean ifGuessed(GameNumber drawnNumber, GameNumber providedNumber) {

        if (drawnNumber.equals(providedNumber)) {
            message.replace(0, message.length(),"Congratulations! You've guessed the drawn number.");
            return true;
        } else if (drawnNumber.isHigherThan(providedNumber)) {
            message.replace(0, message.length(),"Your bet is too high!");
            return false;
        } else message.replace(0, message.length(),"Your bet is too low!");
        return false;
    }

    public static String getMessage() {
        return message.toString();
    }
}