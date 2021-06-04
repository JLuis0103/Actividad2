package app.ito.poo;

import clase.ito.poo.Cancion;
import java.time.LocalDate;

public class MyApp {
	
	static void run() {
		Cancion c1 = new Cancion("Faded", 3, 31, LocalDate.of(2015, 12, 1), LocalDate.of(2015, 12, 3));
		System.out.println(c1);
		System.out.println(c1.addInterprete("K-391"));
		System.out.println(c1.addInterprete("Martin Garrix"));
		System.out.println(c1.addInterprete("K-391"));
		System.out.println(c1);
	}

	public static void main(String[] args) {
		run();
	}

}
