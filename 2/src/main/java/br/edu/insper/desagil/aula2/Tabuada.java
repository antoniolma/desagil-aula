package br.edu.insper.desagil.aula2;

public class Tabuada {

	public String constroi(int n) {
		String tabuada = "";
		
		for (int line = 1; line <= n; line++) {
			for (int i = 1; i <= n; i++) {
				String num = Integer.toString(line * i) + " ";
				tabuada += num;
			}
			tabuada += "\n";
		}
		
		return tabuada;
	}
}
