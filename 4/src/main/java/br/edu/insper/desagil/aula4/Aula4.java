package br.edu.insper.desagil.aula4;

public class Aula4 {
	public static void main(String[] args) {
		/* Seu código. */
		Ship ship;
		ship = new Ship(2, 1);
		
		ship.move(-1, 1);
		
		System.out.println(ship.getX() + ", " + ship.getY());
	
	}
}
