package Entidades;

public class EspadaInimigo extends EnemyWeapon {

	private final static int DANO = 15;
	
	public EspadaInimigo() {
		super(DANO);
	}

	@Override
	public String toString() {
		return " deu uma estocada com a espada";
	}
	
}