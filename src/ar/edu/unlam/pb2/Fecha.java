package ar.edu.unlam.pb2;

public class Fecha {
	private Dia dia;
	private Mes mes;
	private Ano ano;
	
	public Fecha(Dia dia, Mes mes, Ano ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public Ano getAno() {
		return ano;
	}

	public void setAno(Ano ano) {
		this.ano = ano;
	}
	
	
}
