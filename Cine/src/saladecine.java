
public class saladecine {
	private int fila=4;
	private int columna = 5;
	private String[][] asientos = new String[fila + 1][columna + 1];
	private double totalventas;
	private int ticketsvendidos;

	saladecine() {
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[0].length; j++) {
				if (i == 0 && j == 0) {
					asientos[i][j]= " ";
				} else if (i == 0) {
					asientos[i][j]=String.valueOf(j);
				} else if (j == 0) {
					asientos[i][j]=String.valueOf(i);
				} else {
					asientos[i][j] = "D";
				}
			}
		}
	}

	public String[][] getAsientos() {
		return asientos;
	}

	public double getTotalventas() {
		return totalventas;
	}

	public void setTotalventas(double totalventas) {
		this.totalventas = totalventas;
	}

	public int getTicketsvendidos() {
		return ticketsvendidos;
	}

	public void setTicketsvendidos(int ticketsvendidos) {
		this.ticketsvendidos = ticketsvendidos;
	}

	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}

	
	

}
