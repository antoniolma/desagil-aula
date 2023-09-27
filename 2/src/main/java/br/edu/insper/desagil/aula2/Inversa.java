package br.edu.insper.desagil.aula2;

public class Inversa {

	public String constroi(String s) {
		String inv = "";
		
		for (int i = 0; i < s.length(); i++) {
			inv = s.charAt(i) + inv;
		}
		
		return inv;
	}

}
