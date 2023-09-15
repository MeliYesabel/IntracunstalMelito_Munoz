package ar.edu.unlam.pb2;

public class Materia {
	
	private String nombreMateria;
	private Integer codigo;
	private ArrayList<Comision> arrayDeCurso = new ArrayList<>();
	private ArrayList<Materia> arrayMateriasCorrelativas = new ArrayList<>();
	
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

	public Comision getCursoPorCodigoDeComision(Integer CodigoCurso){
		Comision comision=null;
		for(int i=0;i<arrayDeCurso.size();i++){
			if(arrayDeCurso.getCodigoCurso(i)==){

			}
		}


		return comision;
	}

	public Materia buscarMateriaCorrelativaPorCodigoDeMateria(Integer codigoDeMateriaCorrelativa) {
		Materia materiaBuscada=null;
		for(int i=0; i<this.arrayDeMateriasCorrelativas.size(); i++) {
			if(this.arrayDeMateriasCorrelativas.get(i).getCodigoDeMateria().equals(codigoDeMateriaCorrelativa)){
				materiaBuscada=this.arrayDeMateriasCorrelativas.get(i);
			}
		}
		
		return materiaBuscada;
		
	}

	public void ingresarMateriaCorrelativa(Materia materiaCorrelativa) {
		this.arrayDeMateriasCorrelativas.add(materiaCorrelativa);
	}
	
	public Integer cantidadDeMateriasCorrelativas(){
		return this.arrayDeMateriasCorrelativas.size();
	}
	
	public void eliminarMateriaCorrelativaPorCodigoDeMateria(Integer codigoDeMateriaCorrelativa) {
		Materia materiaAEliminar=buscarMateriaCorrelativaPorCodigoDeMateria(codigoDeMateriaCorrelativa);
		this.arrayDeMateriasCorrelativas.remove(materiaAEliminar);
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
