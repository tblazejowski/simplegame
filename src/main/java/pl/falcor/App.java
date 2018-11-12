package pl.falcor;

import pl.falcor.io.MyReader;
import pl.falcor.io.Projector;
import pl.falcor.domain.GameNumber;
import pl.falcor.domain.Inspector;
import pl.falcor.domain.Interval;

class App {

	public static void main(String[] args) {
		Interval interval = new Interval(1, 100);
		GameNumber drawnNumber = interval.draw();
        Projector.display(String.format("Welcome in simple guessing game!\nPlease provide number %s:", interval));
        GameNumber providedNumber = new GameNumber(MyReader.read());
        while (!Inspector.ifGuessed(drawnNumber, providedNumber)) {
            Projector.display(Inspector.getMessage());
            Projector.display(String.format("Please provide number %s:", interval));
            providedNumber = new GameNumber(MyReader.read());
        }
        Projector.display(Inspector.getMessage());
	}
}