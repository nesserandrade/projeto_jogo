package Entidades;

public class Player {
	private String nome;
	private String sexo;
	private PlayerClass classe;
	private PlayerWeapon arma;
	private GameDifficulty dificuldade;
	private int coins;

	public Player(String nome, String sexo, PlayerClass classe, int arma, GameDifficulty dificuldade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.classe = classe;
		this.arma = classe.getArmas(arma - 1);
		this.dificuldade = dificuldade;
	}


	public String getNome() {
		return nome;
	}


	public String getSexo() {
		return sexo;
	}


	public PlayerClass getClasse() {
		return classe;
	}


	public PlayerWeapon getArma() {
		return arma;
	}


	public GameDifficulty getDificuldade() {
		return dificuldade;
	}
	
	public int getCoins() {
		return coins;
	}


	public void setCoins(int coins) {
		this.coins = coins;
	}
	
	
	
}
