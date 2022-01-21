package Entidades;

public class OrcLeader extends Enemy {
	
	private final static EnemyWeapon[] ARMAS_DISPONIVEIS = {new EspadaInimigo()};
	
	private final static int ATAQUE = 30;
	private final static int DEFESA = 30;
	private final static int VIDA = 100;
	
	public OrcLeader() {
		super(ATAQUE, DEFESA, ARMAS_DISPONIVEIS, VIDA);
	}

	@Override
	public String toString() {
		return "Orc líder";
	}
	
}