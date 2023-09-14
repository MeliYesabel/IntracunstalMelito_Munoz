package ar.edu.unlam.pb2;

public class Alumno {
	private Integer dni;
	private String apellido;
	private String nombre;
	private Fecha fechaNac;
	private Fecha fechaIngreso; 
	
	public Alumno(Integer dni, String apellido, String nombre) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	public Alumno(Integer dni, String apellido, String nombre, Fecha fechaNac, Fecha fechaIngreso) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;				
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Fecha getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Fecha fechaNac) {
		this.fechaNac = fechaNac;
	}
	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
}
