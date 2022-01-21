package Entidades;

public class Machado extends PlayerWeapon {

	private final static int DANO = 25;
	
	public Machado() {
		super(DANO);
	}

	@Override
	public String toString() {
		return " brandiu o seu machado";
	}
	
}
