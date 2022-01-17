package Entidades;

public class Besta extends PlayerWeapon {

	private final static double DANO = 20;
	
	public Besta() {
		super(DANO);
	}

	@Override
	public String toString() {
		return "besta";
	}
	
}