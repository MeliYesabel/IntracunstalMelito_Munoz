package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Universidad {

	
	private ArrayList<Alumno> alumnos;
	private String nombre;
	private ArrayList<Materia> materias;
	private ArrayList<InscripcionMateria> inscripcionesMateria;

	public Universidad(String nombre) {
		this.nombre = nombre;
		this.alumnos = new ArrayList<Alumno>();
		this.materias = new ArrayList<>();
		this.inscripcionesMateria = new ArrayList<>();
	}

	
	//ALUMNO
	public Boolean existeAlumno(Integer dni) {
		boolean existencia = false;
		for (int i = 0; i < alumnos.size(); i++) {
			if (this.alumnos.get(i).getDni().equals(dni)) {
				existencia = true;
			}
		}
		return existencia;
	}
	 
	public Boolean registracion(Alumno alumno) {
		boolean exito = false;
		if (buscarAlumnoPorDni(alumno.getDni()) == null && 
				existeAlumno(alumno.getDni())== false) {
			this.alumnos.add(alumno);
			exito = true;
		}
		return exito;
	}

	public Alumno buscarAlumnoPorDni(Integer dni) {

		for (int i = 0; i < alumnos.size(); i++) {
			if (this.alumnos.get(i).getDni().equals(dni))
				return this.alumnos.get(i);
		}
		return null;
	}

	//MATERIA
	public Boolean registraMateria(Materia materia) {
		return this.materias.add(materia);
	}

	public boolean inscribirAlumnoAUnaMateria(Integer dni, Integer codigo) {

		Alumno alumno = this.buscarAlumnoPorDni(dni);
		Materia materia = this.buscarMateriaPorCodigo(codigo);

		if (alumno != null && materia != null) {

			InscripcionMateria inscripcionMateria = new InscripcionMateria(alumno, materia);
			return this.inscripcionesMateria.add(inscripcionMateria);

		}

		return false;
	}

	private Materia buscarMateriaPorCodigo(Integer codigo) {
		for (int i = 0; i < this.materias.size(); i++) {
			if (this.materias.get(i).getCodigoMateria().equals(codigo))
				return this.materias.get(i);
		}
		return null;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
