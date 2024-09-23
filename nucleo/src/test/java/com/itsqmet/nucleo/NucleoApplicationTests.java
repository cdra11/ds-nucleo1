package com.itsqmet.nucleo;

import com.itsqmet.nucleo.modelo.*;
import com.itsqmet.nucleo.servicio.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NucleoApplicationTests {
/*
	@Autowired
	private ICursoServicio cursoServicio;

	@Autowired
	private IAulaServicio aulaServicio;

	@Autowired
	private IEstudianteServicio estudianteServicio;

	@Autowired
	private IMatriculaServicio matriculaServicio;

	@Autowired
	private IProfesorServicio profesorServicio;
*/
	@Test
	void contextLoads() {
/*
		// Inserción de Curso
		Curso curso = new Curso();
		curso.setCursoNombre("Física");
		curso.setDescripcion("Curso de mecánica cuántica");
		curso.setCredito(5);
		cursoServicio.insertarCurso(curso);

		// Inserción de Profesor
		Profesor profesor = new Profesor();
		profesor.setNombre("Lucía");
		profesor.setApellidoProfesor("Martínez");
		profesor.setCorreo("lucia.martinez@universidad.com");
		profesor.setEspecializacion("Física Teórica");
		profesorServicio.insertarProfesor(profesor);

		// Inserción de Estudiante
		Estudiante estudiante = new Estudiante();
		estudiante.setNombreEstudiante("Ana");
		estudiante.setApellidoEstudiante("Gómez");
		estudiante.setFechaNacimiento("1999-08-23");
		estudiante.setCorreo("ana.gomez@correo.com");
		estudianteServicio.insertarEstudiante(estudiante);

		// Inserción de Aula
		Aula aula = new Aula();
		aula.setNombreAula("Aula 202");
		aula.setCapacidad("40");
		aula.setCurso(curso); // Relacionar con el curso previamente creado
		aulaServicio.insertarAula(aula);

		// Inserción de Matricula
		Matricula matricula = new Matricula();
		matricula.setNombre("Matricula Ana Gómez");
		matricula.setFkMatricula(estudiante); // Relacionar con el estudiante previamente creado
		matricula.setCurso(curso); // Relacionar con el curso previamente creado
		matriculaServicio.insertarMatricula(matricula);
*/
	}
}

