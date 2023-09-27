package br.edu.insper.desagil.aula4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Oferecimento{
	private Disciplina nome;
	private LocalDate init;
	private LocalDate end;
	private List<Matricula> matriculas;
	
	public Oferecimento(Disciplina nome, LocalDate init, LocalDate end) {
		this.nome = nome;
		this.init = init;
		this.end = end;
		this.matriculas = new ArrayList<>();
	}
	
	public Disciplina getDisciplina() {
		return nome;
	}
	
	public LocalDate getInit() {
		return init;
	}
	
	public LocalDate getEnd() {
		return end;
	}
	
	public void fazMatricula(Aluno aluno) {
		Matricula matricula = new Matricula(aluno);
		matriculas.add(matricula);
	}
	
	public int numeroDeAlunos() {
		return matriculas.size();
	}
}