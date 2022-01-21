package Entidades;

public class Adaga extends PlayerWeapon {

	private final static int DANO = 25;
	
	public Adaga() {
		super(DANO);
	}

	@Override
	public String toString() {
		return " furou com sua adaga";
	}
	
}