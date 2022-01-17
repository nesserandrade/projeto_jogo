package Entidades;

public class Archer extends PlayerClass {
	
	private final static PlayerWeapon[] ARMAS_DISPONIVEIS = {new Arco(), new Besta()};
	private final static int ATAQUE = 30;
	private final static int DEFESA = 10;
	private final static int VIDA = 80;
	
	public Archer() {
		super(ATAQUE, DEFESA, ARMAS_DISPONIVEIS, VIDA);
	}
}
