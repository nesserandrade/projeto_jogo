package Entidades;

public class Clava extends PlayerWeapon {

	private final static double DANO = 20;
	
	public Clava() {
		super(DANO);
	}

	@Override
	public String toString() {
		return "clava";
	}
	
}