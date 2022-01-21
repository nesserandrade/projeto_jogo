package Entidades;

public abstract class Enemy {
	
	private int defesa;
	private EnemyWeapon[] armas;
	private double vida;
	private int ataque;
	
	public Enemy(int ataque, int defesa, EnemyWeapon[] armas, double vida) {
		this.ataque = ataque;
		this.defesa = defesa;
		this.armas = armas;
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public EnemyWeapon getArmas(int arma) {
		return armas[arma];
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}
}