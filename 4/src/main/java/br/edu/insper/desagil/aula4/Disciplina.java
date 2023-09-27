package br.edu.insper.desagil.aula4;

public class Disciplina{
	private String codigo;
	private String nome;	
	
	public Disciplina(String code, String name) {
		this.codigo = code;
		this.nome = name;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
}