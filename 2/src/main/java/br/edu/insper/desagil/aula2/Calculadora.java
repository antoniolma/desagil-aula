package br.edu.insper.desagil.aula2;

public class Calculadora {
	
	public double executa(int a, int b, char op) {
	    double r;
	    if (op == '+') {
	        r = a + b;
	    } else if (op == '-') {
	        r = a - b;
	    } else if (op == '*') {
	        r = a * b;
	    } else if (op == '/' && b != 0) {
	        r = a / (double) b;
	    } else {
	        r = 0.0;
	    }
	    return r;
	}

}
