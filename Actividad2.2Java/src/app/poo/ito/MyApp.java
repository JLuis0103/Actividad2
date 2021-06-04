package app.poo.ito;
import java.time.LocalDate;

import clases.ito.poo.Expedientes;
import clases.ito.poo.Sintomas;

public class MyApp {
	
	static void run() {
		Sintomas s1 = new Sintomas(36.5F, 178F, 96.5F);
		s1.addSintomas("Tos");
		s1.addSintomas("Dolores de cabeza");
		s1.addSintomas("Mucosidad nasal");
		Expedientes e1 = new Expedientes("Jose Luis", "VECJ880326 XXX", LocalDate.of(2002, 2, 2), s1);
		System.out.println(e1);
		e1.addConsulta(LocalDate.of(2004, 5, 23));
		e1.addConsulta(LocalDate.of(2007, 12, 1));
		e1.addDiagnostico("Gripe Comun");
		e1.addReceta("Paracetamol");
		System.out.println();
		System.out.println(e1);
	}

	public static void main(String[] args) {
		run();
	}

}
