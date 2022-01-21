package Entidades;

public class Shuriken extends PlayerWeapon {

	private final static int DANO = 20;
	
	public Shuriken() {
		super(DANO);
	}

	@Override
	public String toString() {
		return " lançou um shuriken";
	}
	
}