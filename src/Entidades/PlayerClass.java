package Entidades;

public abstract class PlayerClass {
	
	private int defesa;
	private PlayerWeapon[] armas;
	private double vida;
	private int ataque;
	
	public PlayerClass(int ataque, int defesa, PlayerWeapon[] armas, double vida) {
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

	public PlayerWeapon getArmas(int arma) {
		return armas[arma];
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}
}
