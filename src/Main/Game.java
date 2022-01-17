package Main;

import java.util.Random;
import java.util.Scanner;

import Entidades.GameDifficulty;

public class Game {

  private static Scanner keyboard;
  private static Random random;

  public static void main(String[] args) {
    keyboard = new Scanner(System.in);
    random = new Random();
    
    System.out.println("Seja bem vindo(a) à BATALHA FINAL!!");
    System.out.println("\tEscolha o nível de dificuldade:");
    System.out.println("\t# 1 para o modo fácil");
    System.out.println("\t# 2 para o modo normal");
    System.out.println("\t# 3 para o modo difícil");
    String dificuldade = keyboard.nextLine();
    while ((!dificuldade.equals("1")) && (!dificuldade.equals("2")) && (!dificuldade.equals("3"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	dificuldade = keyboard.nextLine();
    }
    GameDifficulty nivelDeDificuldade = new GameDifficulty(dificuldade);
    System.out.println("\tEscolha o nome do jogador:");
    String nomeJogador = keyboard.nextLine();
    System.out.println("\tEscolha o sexo do jogador:");
    System.out.println("\t# M para masculino");
    System.out.println("\t# F para feminino");
    String sexoJogador = keyboard.nextLine();
    while ((!sexoJogador.equals("M")) && (!sexoJogador.equals("F"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	sexoJogador = keyboard.nextLine();
    }
    System.out.println("\tEscolha a classe de batalha do jogador:");
    System.out.println("\t# 1 para Guerreiro");
    System.out.println("\t# 2 para Ladino");
    System.out.println("\t# 3 para Arqueiro");
    String classeJogador = keyboard.nextLine();
    while ((!classeJogador.equals("1")) && (!classeJogador.equals("2")) && (!classeJogador.equals("3"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	classeJogador = keyboard.nextLine();
    }
    
  }

}
