package br.edu.insper.desagil.aula2;

public class Bissexto {

	public boolean decide(int ano) {
		/*
		if (ano % 4.0 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
			return true;
	}
		return false;
		}
		*/
		if (ano % 4 != 0) {
			return false;
		}
		return true;
}
}