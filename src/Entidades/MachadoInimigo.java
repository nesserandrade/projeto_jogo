package Entidades;

public class MachadoInimigo extends EnemyWeapon {

	private final static int DANO = 20;
	
	public MachadoInimigo() {
		super(DANO);
	}

	@Override
	public String toString() {
		return " brandiu o seu machado";
	}
	
}