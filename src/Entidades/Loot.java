package Entidades;

import java.util.Random;

public class Loot {
	private int coinDropChance = 50;
	
	
	public void lootChance (Player jogador) {
		Random random = new Random();
		if (random.nextInt(101) > coinDropChance) {
			int coins = random.nextInt(101); 
			jogador.setCoins(jogador.getCoins() + coins);
			System.out.println("Você ganhou " + coins + " moedas de ouro e agora tem " + jogador.getCoins() + " moedas de ouro.");
		}
	}
}
