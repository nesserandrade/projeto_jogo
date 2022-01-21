package Entidades;

public class Archer extends PlayerClass {
	
	private final static PlayerWeapon[] ARMAS_DISPONIVEIS = {new Arco(), new Besta()};
	private final static int ATAQUE = 40;
	private final static int DEFESA = 30;
	private final static int VIDA = 120;
	
	public Archer() {
		super(ATAQUE, DEFESA, ARMAS_DISPONIVEIS, VIDA);
	}
	
	@Override
	public String toString() {
		return "Arqueiro ";
	}
}
