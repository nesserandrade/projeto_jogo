package Entidades;

public class Besta extends PlayerWeapon {

	private final static int DANO = 20;
	
	public Besta() {
		super(DANO);
	}

	@Override
	public String toString() {
		return " atirou um dardo";
	}
	
}