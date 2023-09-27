package br.edu.insper.desagil.aula2;

public class Arvore {

	public String constroi(int n) {
		String arvore = "";
//		arvore += "\n";
//	
		for (int linha = 1; linha <= n; linha++) {
			for (int esp = n - linha; esp > 0; esp--) {
				arvore += " ";
			}
			for (int fol_esq = linha - 1; fol_esq > 0; fol_esq--) {
				arvore += "/";
			}
			
			arvore += "|";

			for (int fol_esq = linha - 1; fol_esq > 0; fol_esq--) {
				arvore += "\\";
			}
			arvore += "\n";
			
		}
		return arvore;
	}

}
