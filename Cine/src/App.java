
public class App {

	saladecine s1;

	App() {
		s1 = new saladecine();
	}

	public boolean comprarEntradas() {
		boolean compraOk=true;
		Entrada e1 = new Entrada();
		int fila,columna;
		do {
			System.out.println("Elige la fila");
			fila = Consola.leeInt();
			System.out.println("Elige la columna");
			columna = Consola.leeInt();
		} while (fila < 1 || fila > s1.getAsientos().length -1 || columna < 1 || columna > s1.getAsientos()[0].length -1 );
		
		if (s1.getAsientos()[fila][columna].equals("X")) {
			System.out.println("Asiento ocupado");
			compraOk=false;
		} else {
			s1.getAsientos()[fila][columna]="X";
			System.out.println("Compra realizada con exito");
			double ventasActuales = s1.getTotalventas();
			s1.setTotalventas(ventasActuales + e1.t1.precio);
			int t = s1.getTicketsvendidos();
			s1.setTicketsvendidos(t + 1);
		}
		
		return compraOk;
	}
	
	public boolean devolverEntradas() {
		boolean vueltaOk=true;
		int fila,columna;
		do {
			System.out.println("Dime la fila de la entrada");
			fila = Consola.leeInt();
			System.out.println("Dime la columna de la entrada");
			columna = Consola.leeInt();
		} while (fila < 1 || fila > s1.getAsientos().length -1 || columna < 1 || columna > s1.getAsientos()[0].length -1 );
		
		if (s1.getAsientos()[fila][columna].equals("D")) {
			System.out.println("Ese asiento no ha sido comprado anteriormente");
			vueltaOk=false;
		} else {
			s1.getAsientos()[fila][columna]="D";
			System.out.println("Vuelta realizada con exito");
			double ventasActuales = s1.getTotalventas();
			s1.setTotalventas(ventasActuales - 6.75);
			int t = s1.getTicketsvendidos();
			s1.setTicketsvendidos(t - 1);
		}
		
		return vueltaOk;
	}

	public void verDisponibilidadAsientos() {

		String[][] asientos = s1.getAsientos();
		System.out.println("Asientos (D=Disponible,X=Ocupado)");
		for (int i = 0; i < asientos.length; i++) {

			for (int j = 0; j < asientos[i].length; j++) {
				
				System.out.print(asientos[i][j] + "\t");
			}
			System.out.println();
		}

	}
	
	public void estadisticas () {
		System.out.println("El total de ventas son :" + s1.getTotalventas());
		int asientos = s1.getFila() * s1.getColumna();
		int ticketv = s1.getTicketsvendidos();
		double porcen = (double)ticketv / asientos * 100;
		System.out.println("El porcentaje de ventas es :" + porcen +"%");
		System.out.println();
	}

	public static void main(String[] args) {
		
		App s1 = new App();
		int opcion;
		System.out.println("Bienvenido a la Sala de Cine");
		do {
			System.out.println("Estas son las opciones");
			System.out.println("1 -Ver disponibilidad de asientos");
			System.out.println("2 -Comprar Entradas");
			System.out.println("3 -Devolver Entradas");
			System.out.println("4 -Ver el total de ventas/estadisticas");
			System.out.println("5 -Salir");
			do {
				opcion = Consola.leeInt();
			}while (opcion < 1 || opcion > 6);
			
			switch (opcion) {
			case 1:
				s1.verDisponibilidadAsientos();
				break;
			case 2:
				s1.comprarEntradas();
				break;
			case 3:
				s1.devolverEntradas();
				break;
			case 4:
				s1.estadisticas();
				break;

			}

		} while (opcion != 5);
		System.out.println("Gracias por usar la App");

	}
}
