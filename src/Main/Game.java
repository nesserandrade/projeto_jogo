package Main;

import java.util.Random;
import java.util.Scanner;

import Entidades.GameDifficulty;
import Entidades.Machado;
import Entidades.Warrior;
import Entidades.Rogue;
import Entidades.Shuriken;
import Entidades.Adaga;
import Entidades.Archer;
import Entidades.Arco;
import Entidades.Besta;
import Entidades.Clava;
import Entidades.PlayerClass;
import Entidades.PlayerWeapon;

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
    String classeJogadorStr = keyboard.nextLine();
    while ((!classeJogadorStr.equals("1")) && (!classeJogadorStr.equals("2")) && (!classeJogadorStr.equals("3"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	classeJogadorStr = keyboard.nextLine();
    }
    
    PlayerClass classeJogador;
    
    switch (classeJogadorStr) {
    case "1": {
      classeJogador = new Warrior();
      break;
    }
    case "2": {
    	classeJogador = new Rogue();
      break;
    }
    case "3": {
    	classeJogador = new Archer();
      break;
    }
    default:
    {
    	break;
    }
}
    if (classeJogadorStr.equals("1")) {
    System.out.println("\tEscolha a arma de batalha do jogador:");
    System.out.println("\t# 1 para Machado");
    System.out.println("\t# 2 para Clava");
    String armaBatalhaStr = keyboard.nextLine();
    while ((!armaBatalhaStr.equals("1")) && (!armaBatalhaStr.equals("2"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	armaBatalhaStr = keyboard.nextLine();
    	PlayerWeapon armaBatalha;
   switch (armaBatalhaStr) {
        case "1": {
        	armaBatalha = new Machado();
          break;
        }
        case "2": {
        	armaBatalha = new Clava();
          break;
        }
        default:
        {
        	break;
        }
    }
  }}
    
    if (classeJogadorStr.equals("2")) {
    System.out.println("\tEscolha a arma de batalha do jogador:");
    System.out.println("\t# 1 para Adaga");
    System.out.println("\t# 2 para Shuriken");
    String armaBatalhaStr = keyboard.nextLine();
    while ((!armaBatalhaStr.equals("1")) && (!armaBatalhaStr.equals("2"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	armaBatalhaStr = keyboard.nextLine();
    	PlayerWeapon armaBatalha;
   switch (armaBatalhaStr) {
        case "1": {
        	armaBatalha = new Adaga();
          break;
        }
        case "2": {
        	armaBatalha = new Shuriken();
          break;
        }
        default:
        {
        	break;
        }
    }
  }}
    
    if (classeJogadorStr.equals("3")) {
    System.out.println("\tEscolha a arma de batalha do jogador:");
    System.out.println("\t# 1 para Arco");
    System.out.println("\t# 2 para Besta");
    String armaBatalhaStr = keyboard.nextLine();
    while ((!armaBatalhaStr.equals("1")) && (!armaBatalhaStr.equals("2"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	armaBatalhaStr = keyboard.nextLine();
    	PlayerWeapon armaBatalha;
   switch (armaBatalhaStr) {
        case "1": {
        	armaBatalha = new Arco();
          break;
        }
        case "2": {
        	armaBatalha = new Besta();
          break;
        }
        default:
        {
        	break;
        }
    }
  }}
    
    System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.\r\n"
    		+ "\r\n"
    		+ "    Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre esse mal.");
    System.out.println("/t # Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui. Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo:");
    System.out.println("/t # 1 - Glória");
    System.out.println("/t # 2 - Vingança");
    String motivacao = keyboard.nextLine();
    while ((!motivacao.equals("1")) && (!motivacao.equals("2"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	motivacao = keyboard.nextLine();
    }
    if (motivacao.equals("1")) {
    	System.out.println("Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.");
    }
    	else if (motivacao.equals("2")) {
        	System.out.println("Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).");
    }
    System.out.println("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado. Você avança pelo portal.");
    System.out.println("A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à frente, ou desistir.");
    
    System.out.println("/t # 1 - Seguir em frente");
    System.out.println("/t # 2 - Desistir");
    String segue = keyboard.nextLine();
    while ((!segue.equals("1")) && (!segue.equals("2"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	segue = keyboard.nextLine();
    }
    if (segue.equals("1")) {
    	System.out.println("Você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.");
    }
    	else if (segue.equals("2")) {
        	System.out.println("O medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta para a noite lá fora e corre em direção à segurança.");
        System.exit(0);
    }
    System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.");
    System.out.println("/t # 1 - Andando cuidadosamente");
    System.out.println("/t # 2 - Correndo");
    System.out.println("/t # 3 - Saltando");
    String comoProsseguir = keyboard.nextLine();
    while ((!comoProsseguir.equals("1")) && (!comoProsseguir.equals("2")) && (!comoProsseguir.equals("3"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	comoProsseguir = keyboard.nextLine();
    }
    if (comoProsseguir.equals("1")) {
    	System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.");
    
    }
    
}
}
