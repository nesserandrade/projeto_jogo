package Entidades;

public class OrcShaman extends Enemy {
	
	private final static EnemyWeapon[] ARMAS_DISPONIVEIS = {new CajadoInimigo()};
	
	private final static int ATAQUE = 30;
	private final static int DEFESA = 20;
	private final static int VIDA = 70;
	
	public OrcShaman() {
		super(ATAQUE, DEFESA, ARMAS_DISPONIVEIS, VIDA);
	}
	
	@Override
	public String toString() {
		return "Orc Alquimista";
	}
}