package Entidades;

public class CajadoInimigo extends EnemyWeapon {

	private final static int DANO = 15;
	
	public CajadoInimigo() {
		super(DANO);
	}

	@Override
	public String toString() {
		return " lançou uma bola de fogo";
	}
	
}