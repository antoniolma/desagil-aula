package br.edu.insper.desagil.aula4;

public class Ship{
	
	private int x;
	private int y;
	
	public Ship(int X, int Y) {
		this.x = X;
		this.y = Y;
	}
	
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public int getX () {
		return x;
	}
	
	public int getY () {
		return y;
	}
	
	public void setX (int X) {
		this.x = X;
	}
	
	public void setY (int Y) {
		this.y = Y;
	}
}
