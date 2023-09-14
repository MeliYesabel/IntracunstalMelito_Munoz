package ar.edu.unlam.pb2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUniversidad {
	@Test
	public void queSePuedaRegistrarUnAlumnoAUnaUniversidad() {
		 String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	nombre = "Marta";
    	String apellido = "perez";
    	Integer dni= 44555; 
    	Alumno alumno = new Alumno (dni,apellido, nombre);
		Boolean registroExitoso = unlam.registrar(alumno);
    	assertTrue(registroExitoso);	
	}
	
	
	@Test
	public void queNoSePuedaRegistrarUnAlumnoCuandoElAlumnoYaEsteRegistradoAUnaUniversidad() {
		 String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	nombre = "Marta";
    	String apellido = "perez";
    	Integer dni= 44555; 
    	Alumno alumno = new Alumno (dni,apellido, nombre);
    	Alumno alumno2 = new Alumno (dni,"jose", "Lopez");
    	unlam.registrar(alumno);
		Boolean registroExitoso = unlam.registrar(alumno2);
    	assertFalse(registroExitoso);
    	
    	
	}
	
	@Test
	public void queSePuedaRegistrarUnaMateriaAUnaUniversidad() {
		 String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	nombre = "PB2 ";
        Integer codigo = 1;
        Materia pb2 = new Materia (nombre,codigo);
        assertTrue (unlam.registraMateria(pb2));
    	       
	}
	
	
	
	@Test
	public void queSePuedaInscribirUnAlumnoenMateria() {
		 String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	nombre = "PB2 ";
        Integer codigo = 1;
        Materia pb2 = new Materia (nombre,codigo);
        unlam.registraMateria(pb2);
     	nombre = "Marta";
    	String apellido = "perez";
    	Integer dni= 44555; 
        Alumno alumno = new Alumno (dni,apellido, nombre);
    	unlam.registrar(alumno);
    	assertTrue (unlam.inscribirAlumnoAUnaMateria(dni,codigo)) ;
    	       
	}
}
