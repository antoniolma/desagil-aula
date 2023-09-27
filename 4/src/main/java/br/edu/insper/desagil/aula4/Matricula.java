package br.edu.insper.desagil.aula4;

public class Matricula{
	private Aluno aluno;
	private boolean trancado;
	
	public Matricula(Aluno aluno) {
		this.aluno = aluno;
		this.trancado = false;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public boolean isTrancado() {
		return trancado;
	}
	
	public void setTrancado(boolean trancado) {
		this.trancado = trancado;
	}
}