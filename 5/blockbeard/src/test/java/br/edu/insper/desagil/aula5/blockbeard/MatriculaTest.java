package br.edu.insper.desagil.aula5.blockbeard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatriculaTest {
	Aluno aluno;
	Matricula m;
	
	@BeforeEach
	void setUp() {
		aluno = new Aluno(2, "Hashi", 6.9);
		m = new Matricula(aluno);
	}
	
	@Test
	void constroi() {
		assertNotNull(m.getAluno());
		assertFalse(m.isTrancada());
	}
	
	@Test
	void mudaTrancada() {
		m.setTrancada(true);
		assertTrue(m.isTrancada());	
	}
}
