package Entidades;

public abstract class PlayerWeapon {
	private double dano;

	public PlayerWeapon(double dano) {
		this.dano = dano;
	}

	public double getDano() {
		return dano;
	}
	
	public abstract String toString();
}


