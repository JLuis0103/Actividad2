package app.ito.poo;

import clases.ito.poo.Transporte;
import clases.ito.poo.Viaje;
import java.time.LocalDate;

public class MyApp {
	
	static void run() {
		Transporte t1 = new Transporte("Kenworth", "T660", 30, LocalDate.of(2012, 5, 20));
		System.out.println(t1);
		System.out.println();
		Viaje v1 = new Viaje("Orizaba","Av. Cri-Cri 1430, El Espinal, 94330 Orizaba, Ver.",
				LocalDate.of(2021, 1, 4), LocalDate.of(2021, 1, 10), "Juguetes", 20000);
		Viaje v2 = new Viaje("Cordoba","AUTOPISTA CORDOBA-ORIZABA KM 1 S/N ESQ AV 21, Las Lomas, 94570 Córdoba, Ver.",
				LocalDate.of(2021, 5, 24), LocalDate.of(2021, 5, 27), "Cadena Fria", 20000);
		t1.addViaje(v1);
		t1.addViaje(v2);
		System.out.println(t1);
		t1.elimViaje(v1);
		System.out.println();
		System.out.println(t1);
		} 

	public static void main(String[] args) {
		run();
	}

}
