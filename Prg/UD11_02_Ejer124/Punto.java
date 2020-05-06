package UD11_02_Ejer124;

public class Punto {
	private int X, Y;

	public Punto(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}

	public String toString() {
		return "(" + X + "," + Y + ")";
	}

	public int getX() {
		return X;
	}

	public void setX(int X) {
		this.X = X;
	}

	public int getY() {
		return Y;
	}

	public void setY(int Y) {
		this.Y = Y;
	}

}
