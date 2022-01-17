package Entidades;

public class Machado extends PlayerWeapon {

	private final static double DANO = 25;
	
	public Machado() {
		super(DANO);
	}

	@Override
	public String toString() {
		return "machado";
	}
	
}
