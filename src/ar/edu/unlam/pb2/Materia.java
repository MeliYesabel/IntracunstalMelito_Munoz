package ar.edu.unlam.pb2;

public class Materia {
	
	private String nombreMateria;
	private Integer codigo;
	private ArrayList<Comision> arrayDeCurso = new ArrayList<>();
	
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
	
	public void ingresarCurso(Comision curso){
		this.arrayDeCurso.add(curso);
	}
	
	public Integer getCantidadDeCursos(){
		return this.arrayDeCurso.size();
	}

	public String getNombreDeCursoEspecifico(Integer lugarDelArray) {
		// TODO Auto-generated method stub
		String identificadorDeCurso=this.arrayDeCurso.get(lugarDelArray).getNombreMateria();
		
		return identificadorDeCurso;
	}
	
	public Integer getIdentificadorDeCursoEspecifico(Integer lugarDelArray) {
		// TODO Auto-generated method stub
		Integer identificadorDeCurso=this.arrayDeCurso.get(lugarDelArray).getCodigoCurso();
		
		return identificadorDeCurso;
	}
}
