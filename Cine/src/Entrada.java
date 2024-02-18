
public class Entrada {

	Tarifa t1;
	double normal = 6.75;
	double estudiante = 3.75;
	double vip = 9.75;

	Entrada() {

		int r = elegirOpcion();
		switch (r) {
		case 1:
			t1 = new Tarifa("Normal", normal);
			System.out.println("Has elegido la tarifa Normal");
			break;
		case 2:
			t1 = new Tarifa("Estudiante", estudiante);
			System.out.println("Has elegido la tarifa Estudiante");
			break;
		case 3:
			t1 = new Tarifa("VIP", vip);
			System.out.println("Has elegido la tarifa VIP");
			break;
		}

	}

	public int elegirOpcion() {

		System.out.println("Estas son las tarifas correspondientes");
		System.out.println("Normal (6,75€), Estudiante (3,75€), VIP(9,75€)");
		System.out.println("1 - Normal");
		System.out.println("2 - Estudiante");
		System.out.println("3 - VIP");
		System.out.println("Teclee la opcion a elegir");
		int r = Consola.leeInt();
		while (r != 1 && r != 2 && r != 3) {
			System.out.println("Teclee una opcion valida");
			r = Consola.leeInt();
		}
		return r;
	}

}
