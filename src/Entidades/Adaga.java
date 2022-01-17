package Entidades;

public class Adaga extends PlayerWeapon {

	private final static double DANO = 20;
	
	public Adaga() {
		super(DANO);
	}

	@Override
	public String toString() {
		return "adaga";
	}
	
}