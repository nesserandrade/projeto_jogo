package Entidades;

public class Arco extends PlayerWeapon {

	private final static double DANO = 25;
	
	public Arco() {
		super(DANO);
	}

	@Override
	public String toString() {
		return "arco";
	}
	
}