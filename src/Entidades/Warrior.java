package Entidades;

public class Warrior extends PlayerClass {
	
	private final static PlayerWeapon[] ARMAS_DISPONIVEIS = {new Machado(), new Clava()};
	private final static int ATAQUE = 30;
	private final static int DEFESA = 20;
	private final static int VIDA = 120;
	
	public Warrior() {
		super(ATAQUE, DEFESA, ARMAS_DISPONIVEIS, VIDA);
	}
}
