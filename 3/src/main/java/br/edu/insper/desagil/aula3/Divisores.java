package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.List;

public class Divisores {

	public List<Integer> extrai(int n) {
		List<Integer> div = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				div.add(i);
			}
		}
		
		return div;
	}

}
