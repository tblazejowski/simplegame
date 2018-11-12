package pl.falcor;

class App {
	public static void main(String[] args) {
		Interval interval = new Interval(1, 100);
		GameNumber drawnNumber = interval.draw();
        System.out.println("Drawn number from interval 1-100 is: " + drawnNumber.toString());
	}
}