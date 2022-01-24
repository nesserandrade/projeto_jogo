package Entidades;

import java.util.Random;
import java.util.Scanner;

public class Combat {

	public void fight(Enemy inimigo, PlayerClass classeJogador, String dificuldade, GameDifficulty nivelDeDificuldade,
			PlayerWeapon arma, EnemyWeapon armaInimigo, Player jogador, String motivacao) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		while (inimigo.getVida() > 0) {
			System.out.println("Sua vida: " + classeJogador.getVida());
			System.out.println("Vida do inimigo: " + inimigo.getVida());
			System.out.println("O que você gostaria de fazer?");
			System.out.println("\t# 1 - Lutar");
			System.out.println("\t# 2 - Fugir");
			String decisao = keyboard.nextLine();
			while ((!decisao.equals("1")) && (!decisao.equals("2"))) {
				System.out.println("Opção inválida! Digite novamente!");
				decisao = keyboard.nextLine();
			}
			if (decisao.equals("1")) {
				double vidaJogador = classeJogador.getVida();
				double vidaInimigo = inimigo.getVida();
				int randomDamagePlayer = 1 + random.nextInt(20);
				int randomDamageEnemy = 1 + random.nextInt(20);
				if (dificuldade.equals("1") || dificuldade.equals("2")) {
					if (randomDamagePlayer == 20) {
						double damageDealt = ((arma.getDano() + classeJogador.getAtaque()) + (randomDamagePlayer * 2));
						vidaInimigo = vidaInimigo - damageDealt;
						inimigo.setVida(vidaInimigo);
						System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString()
								+ " e fez um ataque crítico que causou " + damageDealt + " de dano ao inimigo.");
					} else if (randomDamagePlayer == 1) {
						double damageDealt = 0;
						vidaInimigo = vidaInimigo - damageDealt;
						inimigo.setVida(vidaInimigo);
						System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString()
								+ " e errou causando " + damageDealt + " de dano ao inimigo.");
					} else {
						double damageDealt = (arma.getDano() + classeJogador.getAtaque() + randomDamagePlayer)
								- inimigo.getDefesa();
						vidaInimigo = vidaInimigo - damageDealt;
						inimigo.setVida(vidaInimigo);
						System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString() + " e causou "
								+ damageDealt + " de dano ao inimigo.");
					}
					if (randomDamageEnemy == 20) {
						double damageTaken = nivelDeDificuldade.damageModifier(
								((armaInimigo.getDano() + inimigo.getAtaque()) + (randomDamageEnemy * 2)));
						vidaJogador = vidaJogador - damageTaken;
						classeJogador.setVida(vidaJogador);
						System.out.println(inimigo.toString() + armaInimigo.toString()
								+ " e fez um ataque crítico causando " + damageTaken + " de dano ao jogador.");
						if (classeJogador.getVida() < 1) {
							String texto = "";
							if (motivacao.equals("1")) {
								texto = "A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.";
							}
							if (motivacao.equals("2")) {
								texto = "Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.";
							}
							System.out.println("Você não estava preparado para a força do inimigo." + texto);
							break;
						}
					} else if (randomDamageEnemy == 1) {
						double damageTaken = 0;
						vidaJogador = vidaJogador - damageTaken;
						classeJogador.setVida(vidaJogador);
						System.out.println(inimigo.toString() + armaInimigo.toString() + " e errou causando "
								+ damageTaken + " de dano ao jogador.");
						if (classeJogador.getVida() < 1) {
							String texto = "";
							if (motivacao.equals("1")) {
								texto = "A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.";
							}
							if (motivacao.equals("2")) {
								texto = "Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.";
							}
							System.out.println("Você não estava preparado para a força do inimigo." + texto);
							break;
						}
					} else {
						double damageTaken = nivelDeDificuldade
								.damageModifier((armaInimigo.getDano() + inimigo.getAtaque() + randomDamageEnemy))
								- classeJogador.getDefesa();
						vidaJogador = vidaJogador - damageTaken;
						classeJogador.setVida(vidaJogador);
						System.out.println(inimigo.toString() + armaInimigo.toString() + " e causou " + damageTaken
								+ " de dano ao jogador.");
						if (classeJogador.getVida() < 1) {
							String texto = "";
							if (motivacao.equals("1")) {
								texto = "A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.";
							}
							if (motivacao.equals("2")) {
								texto = "Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.";
							}
							System.out.println("Você não estava preparado para a força do inimigo." + texto);
							break;
						}
					}
				}

				if (dificuldade.equals("3")) {
					if (randomDamagePlayer == 20) {
						double damageDealt = nivelDeDificuldade.damageModifier(
								((arma.getDano() + classeJogador.getAtaque()) + (randomDamagePlayer * 2)));
						vidaInimigo = vidaInimigo - damageDealt;
						inimigo.setVida(vidaInimigo);
						System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString()
								+ " e fez um ataque crítico que causou " + damageDealt + " de dano ao inimigo.");
					} else if (randomDamagePlayer == 1) {
						double damageDealt = 0;
						vidaInimigo = vidaInimigo - damageDealt;
						inimigo.setVida(vidaInimigo);
						System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString()
								+ " e errou causando " + damageDealt + " de dano ao inimigo.");
					} else {
						double damageDealt = nivelDeDificuldade
								.damageModifier((arma.getDano() + classeJogador.getAtaque() + randomDamagePlayer))
								- inimigo.getDefesa();
						vidaInimigo = vidaInimigo - damageDealt;
						inimigo.setVida(vidaInimigo);
						System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString() + " e causou "
								+ damageDealt + " de dano ao inimigo.");
					}
					if (randomDamageEnemy == 20) {
						double damageTaken = ((armaInimigo.getDano() + inimigo.getAtaque()) + (randomDamageEnemy * 2));
						vidaJogador = vidaJogador - damageTaken;
						classeJogador.setVida(vidaJogador);
						System.out.println(inimigo.toString() + armaInimigo.toString()
								+ " e fez um ataque crítico causando " + damageTaken + " de dano ao jogador.");
						if (classeJogador.getVida() < 1) {
							String texto = "";
							if (motivacao.equals("1")) {
								texto = "A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.";
							}
							if (motivacao.equals("2")) {
								texto = "Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.";
							}
							System.out.println("Você não estava preparado para a força do inimigo." + texto);
							break;
						}
					} else if (randomDamageEnemy == 1) {
						double damageTaken = 0;
						vidaJogador = vidaJogador - damageTaken;
						classeJogador.setVida(vidaJogador);
						System.out.println(inimigo.toString() + armaInimigo.toString() + " e errou causando "
								+ damageTaken + " de dano ao jogador.");
						if (classeJogador.getVida() < 1) {
							String texto = "";
							if (motivacao.equals("1")) {
								texto = "A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.";
							}
							if (motivacao.equals("2")) {
								texto = "Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.";
							}
							System.out.println("Você não estava preparado para a força do inimigo." + texto);
							break;
						}
					} else {
						double damageTaken = (armaInimigo.getDano() + inimigo.getAtaque() + randomDamageEnemy)
								- classeJogador.getDefesa();
						vidaJogador = vidaJogador - damageTaken;
						classeJogador.setVida(vidaJogador);
						System.out.println(inimigo.toString() + armaInimigo.toString() + " e causou " + damageTaken
								+ " de dano ao jogador.");
						if (classeJogador.getVida() < 1) {
							String texto = "";
							if (motivacao.equals("1")) {
								texto = "A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.";
							}
							if (motivacao.equals("2")) {
								texto = "Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.";
							}
							System.out.println("Você não estava preparado para a força do inimigo." + texto);
							break;
						}
					}
				}
			}
			if (decisao.equals("2")) {
				System.out.println(
						"Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
				System.exit(0);
			}
		}
	}
}
