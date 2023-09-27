package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.List;

public class Audio {

	public void clip(List<Integer> onda, int limite) {
		for (int i = 0; i < onda.size(); i++) {
			int num = onda.get(i);
			if (limite < num) {
				num = limite;
			} else if (-limite > num) {
				num = - limite;
			}
			onda.set(i, num);
		}
	}
}
