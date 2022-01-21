package Entidades;

public class Rogue extends PlayerClass {
	
	private final static PlayerWeapon[] ARMAS_DISPONIVEIS = {new Adaga(), new Shuriken()};
	
	private final static int ATAQUE = 35;
	private final static int DEFESA = 40;
	private final static int VIDA = 120;
	
	public Rogue() {
		super(ATAQUE, DEFESA, ARMAS_DISPONIVEIS, VIDA);
	}
	
	@Override
	public String toString() {
		return "Ladino ";
	}
}
