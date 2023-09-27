package br.edu.insper.desagil.aula5.blockbeard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class AlunoTest {
	private Aluno aluno;
	private static final double DELTA = 0.000001;
	
	@BeforeEach
	void setUp() {
		aluno = new Aluno(2, "Hashi", 3.7); 
	}

	@Test
	void constroi() {
		assertEquals(2, aluno.getId());
		assertEquals("Hashi", aluno.getNome());
		assertEquals(3.7, aluno.getCr(), DELTA);
	}
	
	@Test
	void mudaCr() {
		aluno.setCr(6.9);
		assertEquals(6.9, aluno.getCr(), DELTA);
	}
}
