package UD11_02_Ejer128;

public class Camion extends Vehiculo {
	private Remolque remolque;

	public Camion(String matricula) {
		super(matricula);
		this.remolque = null;
	}

	public void ponRemolque(Remolque remolque) {
		this.remolque = remolque;
	}

	public void quitaRemolque() {
		this.remolque = null;
	}

	public String toString() {
		if (this.remolque == null) {
			return super.toString();
		} else {
			return super.toString() + " -- " + this.remolque.toString();
		}
	}

	public void acelerar(int aumento) throws Exception {
		if (this.velocidad + aumento > 100 && this.remolque != null) {
			throw new Exception("Frenando Alonso");
		} else {
			super.acelerar(aumento);
		}
	}
}
