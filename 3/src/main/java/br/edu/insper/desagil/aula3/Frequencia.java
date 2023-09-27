package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.Map;

public class Frequencia {

	public Map<Character, Integer> conta(String s) {
		Map<Character, Integer> dict = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (dict.containsKey(c) == false) {
				dict.put(c, 0);
			}
			
			int value = dict.get(c) + 1;
			dict.put(c, value);	
		}
		
		return dict;
	}

}
