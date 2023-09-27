package br.edu.insper.desagil.aula5.blockbeard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DisciplinaTest {
	
	@Test
	void constroi() {
		Disciplina d = new Disciplina("123", "Hashi");
		assertEquals("123", d.getCodigo());
		assertEquals("Hashi", d.getNome());
	}

}
