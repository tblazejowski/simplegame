package pl.falcor;

class App {
	public static void main(String[] args) {
		Interval interval = new Interval(1, 100);
		GameNumber drawnNumber = interval.draw();
        Projector.display(String.format("Welcome in simple guessing game!\nPlease provide number %s:", interval));
        final GameNumber providedNumber = new GameNumber(MyReader.read());
        Projector.display(Inspector.inspect(drawnNumber, providedNumber));
	}
}