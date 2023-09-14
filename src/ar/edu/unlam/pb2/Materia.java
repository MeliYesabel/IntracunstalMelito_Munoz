package ar.edu.unlam.pb2;

public class Materia {
	
	private String nombreMateria;
	private Integer codigo;
	
	public Materia(String nombreMateria, Integer codigoMateria) {
		
		this.nombreMateria = nombreMateria;
		this.codigo = codigoMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public Integer getCodigoMateria() {
		return codigo;
	}

	public void setCodigoMateria(Integer codigoMateria) {
		this.codigo = codigoMateria;
	}
	

}
