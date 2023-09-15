package ar.edu.unlam.pb2;

public class Fecha {
	private String fecha;
	// lo escribimos como un String y lo cortamos en base a los valores que necesitamos
	// "11/12/23"
	
	public Fecha(String fecha) {
		this.fecha = fecha;
	}

	public Integer getDia() {
		Integer dia;
		dia=Integer.parseInt(this.fecha.substring(0, 2));
		return dia;
	}

	public Integer getMes() {
		Integer mes;
		mes=Integer.parseInt(this.fecha.substring(3,5));
		return mes;
	}

	public Integer getAno() {
		Integer ano;
		ano=Integer.parseInt(this.fecha.substring(6));
		return ano;
	}
}
