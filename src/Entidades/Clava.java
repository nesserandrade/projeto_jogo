package Entidades;

public class Clava extends PlayerWeapon {

	private final static int DANO = 20;
	
	public Clava() {
		super(DANO);
	}

	@Override
	public String toString() {
		return " deu um golpe com sua clava";
	}
	
}