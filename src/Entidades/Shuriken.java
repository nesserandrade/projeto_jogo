package Entidades;

public class Shuriken extends PlayerWeapon {

	private final static double DANO = 15;
	
	public Shuriken() {
		super(DANO);
	}

	@Override
	public String toString() {
		return "shuriken";
	}
	
}