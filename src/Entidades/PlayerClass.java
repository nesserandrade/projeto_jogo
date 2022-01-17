package Entidades;

public abstract class PlayerClass {
	
	private int ataque;
	private int defesa;
	private PlayerWeapon[] armas;
	private double vida;
	
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

	public PlayerWeapon[] getArmas() {
		return armas;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}
	
	
	
	
}
