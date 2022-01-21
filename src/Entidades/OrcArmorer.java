package Entidades;

public class OrcArmorer extends Enemy {
	
	private final static EnemyWeapon[] ARMAS_DISPONIVEIS = {new EspadaInimigo()};
	
	private final static int ATAQUE = 25;
	private final static int DEFESA = 30;
	private final static int VIDA = 90;
	
	public OrcArmorer() {
		super(ATAQUE, DEFESA, ARMAS_DISPONIVEIS, VIDA);
	}
	
	@Override
	public String toString() {
		return "Orc Armeiro";
	}
}