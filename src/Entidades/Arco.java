package Entidades;

public class Arco extends PlayerWeapon {

	private final static int DANO = 25;
	
	public Arco() {
		super(DANO);
	}

	@Override
	public String toString() {
		return " atirou uma flecha";
	}
	
}