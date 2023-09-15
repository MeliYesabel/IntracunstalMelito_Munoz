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
		Boolean registroExitoso = unlam.registracion(alumno);
    	assertTrue(registroExitoso);	
	}
	
	
	@Test
	public void queNoSePuedaRegistrarUnAlumnoCuandoElAlumnoYaEsteRegistradoALaUniversidad() {
		String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	nombre = "Marta";
    	String apellido = "perez";
    	Integer dni= 44555; 
    	Alumno alumno = new Alumno (dni,apellido, nombre);
    	Alumno alumno2 = new Alumno (dni,"jose", "Lopez");
  
    	unlam.registracion(alumno);
		Boolean registroExitoso = unlam.registracion(alumno2);
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
    	unlam.registracion(alumno);
    	assertTrue (unlam.inscribirAlumnoAUnaMateria(dni,codigo)) ;
    	       
	}
	public void queNoSePuedaAsignar2MateriasConMismoId() {
		String nombre ="Unlam";
		Universidad unlam = new Universidad (nombre);
		nombre = "PB2 ";
        Integer codigo = 1;
        Materia pb2 = new Materia (nombre,codigo);
        codigo = 1;
        Materia pruebaMismoId = new Materia (nombre, codigo);
        assertFalse (unlam.registraMateria(pruebaMismoId));
	}

}
