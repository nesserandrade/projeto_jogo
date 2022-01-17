package Entidades;

public class GameDifficulty {
	private String dificuldade;

	public GameDifficulty(String dificuldade) {
		super();
		this.dificuldade = dificuldade;
	}
	
	public double damageModifier (double damage) {
		if (this.dificuldade.equals("1")) {
			double dano = damage * 0.8;
			return dano;
		}
		
		if (this.dificuldade.equals("2")) {
			double dano = damage * 1;
			return dano;
		}
		
		if (this.dificuldade.equals("3")) {
			double dano = damage * 0.9;
			return dano;
		}
		else {
		return 1;
		}
	}
}


