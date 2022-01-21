package Entidades;

public abstract class EnemyWeapon {
	private int dano;

	public EnemyWeapon(int dano) {
		this.dano = dano;
	}

	public double getDano() {
		return dano;
	}
	
	public abstract String toString();
}
