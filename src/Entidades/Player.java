package Entidades;

public class Player {
	private String nome;
	private String sexo;
	private PlayerClass classe;
	private PlayerWeapon arma;
	private GameDifficulty dificuldade;
	private int vidaJogador = 100;
	
	
	public Player(String nome, String sexo, PlayerClass classe, PlayerWeapon arma, GameDifficulty dificuldade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.classe = classe;
		this.arma = arma;
		this.dificuldade = dificuldade;
	}
	
}
