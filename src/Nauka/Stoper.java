package Nauka;

public class Stoper {

	long start, stop;
	double wynik;

	void start() {
		start = System.currentTimeMillis();
	}

	void stop() {
		stop = System.currentTimeMillis();
	}

	void zeruj() {
		start = 0;
	}

	void podajCzas() {
		System.out.println("czas operacji wynosi: " + (stop - start));
	}
}