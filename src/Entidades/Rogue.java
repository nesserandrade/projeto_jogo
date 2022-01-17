package Entidades;

public class Rogue extends PlayerClass {
	
	private final static PlayerWeapon[] ARMAS_DISPONIVEIS = {new Adaga(), new Shuriken()};
	
	private final static int ATAQUE = 20;
	private final static int DEFESA = 15;
	private final static int VIDA = 100;
	
	public Rogue() {
		super(ATAQUE, DEFESA, ARMAS_DISPONIVEIS, VIDA);
	}
}
