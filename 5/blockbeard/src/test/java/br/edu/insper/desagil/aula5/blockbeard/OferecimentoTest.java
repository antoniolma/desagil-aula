package br.edu.insper.desagil.aula5.blockbeard;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OferecimentoTest {
	Disciplina d;
	Oferecimento o;
	LocalDate str, end;
	double DELTA;
	
	@BeforeEach
	void setUp() {
		DELTA = 0.00001;
		LocalDate str = LocalDate.of(2023, Month.FEBRUARY, 6);
		LocalDate end = LocalDate.of(2023, Month.JUNE, 30);
		
		d = new Disciplina("123", "Hashi");
		o = new Oferecimento(d, str, end);
	}
	
	@Test
	void constroi() {
		assertNotNull(o.getDisciplina());
		assertNotNull(o.getInicio());
		assertNotNull(o.getFim());
		assertEquals(0, o.numeroDeAlunos(), DELTA);
	}

	@Test
	void fazUmaMatricula() {
		Aluno aluno = new Aluno(12, "Hashi", 6.9);
		o.fazMatricula(aluno);
		assertEquals(1, o.numeroDeAlunos());
	}
	
	@Test
	void fazDuasMatriculas() {
		Aluno aluno1 = new Aluno(12, "Hashi", 6.9);
		Aluno aluno2 = new Aluno(21, "Hashimoto", 6.99);
		o.fazMatricula(aluno1);
		o.fazMatricula(aluno2);
		assertEquals(2, o.numeroDeAlunos());
	}
}
