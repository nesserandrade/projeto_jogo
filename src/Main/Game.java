package Main;

import java.util.Random;
import java.util.Scanner;

import Entidades.GameDifficulty;
import Entidades.Machado;
import Entidades.MachadoInimigo;
import Entidades.OrcArmorer;
import Entidades.OrcLeader;
import Entidades.OrcShaman;
import Entidades.Player;
import Entidades.Warrior;
import Entidades.Rogue;
import Entidades.Shuriken;
import Entidades.Adaga;
import Entidades.Archer;
import Entidades.Arco;
import Entidades.Besta;
import Entidades.CajadoInimigo;
import Entidades.Clava;
import Entidades.Enemy;
import Entidades.EnemyWeapon;
import Entidades.EspadaInimigo;
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
    
    PlayerClass classeJogador = null;
    
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
    
    PlayerWeapon armaBatalha = null;
    String armaBatalhaStr = "0";
    if (classeJogadorStr.equals("1")) {
    System.out.println("\tEscolha a arma de batalha do jogador:");
    System.out.println("\t# 1 para Machado");
    System.out.println("\t# 2 para Clava");
    armaBatalhaStr = keyboard.nextLine();
    while ((!armaBatalhaStr.equals("1")) && (!armaBatalhaStr.equals("2"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	armaBatalhaStr = keyboard.nextLine();
    }
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
  }
    
    if (classeJogadorStr.equals("2")) {
    System.out.println("\tEscolha a arma de batalha do jogador:");
    System.out.println("\t# 1 para Adaga");
    System.out.println("\t# 2 para Shuriken");
    armaBatalhaStr = keyboard.nextLine();
    
    while ((!armaBatalhaStr.equals("1")) && (!armaBatalhaStr.equals("2"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	armaBatalhaStr = keyboard.nextLine();
    }
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
  }
    
    if (classeJogadorStr.equals("3")) {
    System.out.println("\tEscolha a arma de batalha do jogador:");
    System.out.println("\t# 1 para Arco");
    System.out.println("\t# 2 para Besta");
    armaBatalhaStr = keyboard.nextLine();
    while ((!armaBatalhaStr.equals("1")) && (!armaBatalhaStr.equals("2"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	armaBatalhaStr = keyboard.nextLine();
    }
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
  }
    
    PlayerWeapon arma = armaBatalha;
    Player jogador = new Player(nomeJogador, sexoJogador, classeJogador,  Integer.parseInt(armaBatalhaStr), nivelDeDificuldade);
    
    System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.\r\n"
    		+ "\r\n"
    		+ "    Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre esse mal.");
    System.out.println("\t # Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui. Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo:");
    System.out.println("\t # 1 - Glória");
    System.out.println("\t # 2 - Vingança");
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
    
    System.out.println("\t # 1 - Seguir em frente");
    System.out.println("\t # 2 - Desistir");
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
        	System.out.println("FIM DO JOGO!");
        System.exit(0);
    }
    System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.");
    System.out.println("\t # 1 - Andando cuidadosamente");
    System.out.println("\t # 2 - Correndo");
    System.out.println("\t # 3 - Saltando");
    String comoProsseguir = keyboard.nextLine();
    while ((!comoProsseguir.equals("1")) && (!comoProsseguir.equals("2")) && (!comoProsseguir.equals("3"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	comoProsseguir = keyboard.nextLine();
    }
    
    if (comoProsseguir.equals("1")) {
    	System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.");
    	
    	int damageTaken = 1 + random.nextInt(10);
    	double vida = classeJogador.getVida();
    	if (damageTaken == 10) {
    		damageTaken = damageTaken * 2;
    		vida = vida - damageTaken;
        	classeJogador.setVida(vida);
        	System.out.println("Você sofreu um ataque crítico e perdeu " + damageTaken + " de vida e agora tem " + vida + " de vida.");
    	} else {
    		vida = vida - damageTaken;
        	classeJogador.setVida(vida);
    		System.out.println("Você perdeu " + damageTaken + " de vida e agora tem " + vida + " de vida.");
    	}
    	
    }
    if (comoProsseguir.equals("2")) {
    	System.out.println("Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");
    }
    
    if (comoProsseguir.equals("3")) {
    	System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
    }
    System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o líder.");
    
    System.out.println("Você se dirige para a porta à direita.");
    
    System.out.println("Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem para espalhar o terror nas cidades e vilas da região.");
    
    System.out.println("Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em posição de combate. Ele avança em sua direção.");
    Enemy armeiro = new OrcArmorer();
    EnemyWeapon espada = new EspadaInimigo();
    while(armeiro.getVida() > 0) {
    	System.out.println("Sua vida: " + classeJogador.getVida());
    	System.out.println("Vida do inimigo: " + armeiro.getVida());
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
        	double vidaArmeiro = armeiro.getVida();
        	int randomDamagePlayer = 1 + random.nextInt(20);
        	int randomDamageEnemy = 1 + random.nextInt(20);
        	
        	if (dificuldade.equals("1") || dificuldade.equals("2")) {
        	double damageTaken = nivelDeDificuldade.damageModifier((espada.getDano() + armeiro.getAtaque() + randomDamageEnemy)) - classeJogador.getDefesa();
        	double damageDealt = (arma.getDano() + classeJogador.getAtaque()  + randomDamagePlayer) - armeiro.getDefesa();
        	vidaJogador = vidaJogador - damageTaken;
        	vidaArmeiro = vidaArmeiro - damageDealt;
        	classeJogador.setVida(vidaJogador);
        	armeiro.setVida(vidaArmeiro);
        	System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString() + " e causou " + damageDealt + " de dano ao inimigo." );
        	System.out.println(armeiro.toString() + espada.toString() + " e causou " + damageTaken + " de dano ao jogador.");
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
        	if (dificuldade.equals("3")) {
            	double damageTaken = (espada.getDano() + armeiro.getAtaque() + randomDamageEnemy) - classeJogador.getDefesa();
            	double damageDealt = nivelDeDificuldade.damageModifier((arma.getDano() + classeJogador.getAtaque() + randomDamagePlayer)) - armeiro.getDefesa();
            	vidaJogador = vidaJogador - damageTaken;
            	vidaArmeiro = vidaArmeiro - damageDealt;
            	classeJogador.setVida(vidaJogador);
            	armeiro.setVida(vidaArmeiro);
            	System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString() + " e causou " + damageDealt + " de dano ao inimigo." );
            	System.out.println(armeiro.toString() + espada.toString() + " e causou " + damageTaken + " de dano ao jogador.");
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
        if (decisao.equals("2")) {
        	System.out.println("Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
        	System.exit(0);
        }
    }
    if (classeJogador.getVida() < 1) {
    	System.out.println("FIM DO JOGO!");
    	System.exit(0);
    }
    System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
    System.out.println("Sua vida depois do combate: " + classeJogador.getVida());
    System.out.println("Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");
    System.out.println("Você quer usar a armadura do inimigo?");
	System.out.println("\t# 1 - Sim");
	System.out.println("\t# 2 - Não");
	String pegarArmadura = keyboard.nextLine();
    while ((!pegarArmadura.equals("1")) && (!pegarArmadura.equals("2"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	pegarArmadura = keyboard.nextLine();
    }    
    if (pegarArmadura.equals("1")) {
    	classeJogador.setDefesa(classeJogador.getDefesa() + 5);
    	System.out.println("Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de armaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios à sua frente.");
    }
    if (pegarArmadura.equals("2")) {
    	System.out.println("Você decide que não precisa utilizar nada que venha das mãos do inimigo.");
    }
    System.out.println("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");
    System.out.println("Você retorna à sala anterior e se dirige à porta da esquerda. Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos soldados para aterrorizar a região.");
    System.out.println("No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.");
    Enemy alquimista = new OrcShaman();
    EnemyWeapon cajado = new CajadoInimigo();
    while(alquimista.getVida() > 0) {
    	System.out.println("Sua vida: " + classeJogador.getVida());
    	System.out.println("Vida do inimigo: " + alquimista.getVida());
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
        	double vidaAlquimista = alquimista.getVida();
        	int randomDamagePlayer = 1 + random.nextInt(20);
        	int randomDamageEnemy = 1 + random.nextInt(20);
        	
        	if (dificuldade.equals("1") || dificuldade.equals("2")) {
        	double damageTaken = nivelDeDificuldade.damageModifier((cajado.getDano() + alquimista.getAtaque() + randomDamageEnemy)) - classeJogador.getDefesa();
        	double damageDealt = (arma.getDano() + classeJogador.getAtaque() + randomDamagePlayer) - alquimista.getDefesa();
        	vidaJogador = vidaJogador - damageTaken;
        	vidaAlquimista = vidaAlquimista - damageDealt;
        	classeJogador.setVida(vidaJogador);
        	alquimista.setVida(vidaAlquimista);
        	System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString() + " e causou " + damageDealt + " de dano ao inimigo." );
        	System.out.println(alquimista.toString() + cajado.toString() + " e causou " + damageTaken + " de dano ao jogador.");
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
        	if (dificuldade.equals("3")) {
            	double damageTaken = (cajado.getDano() + alquimista.getAtaque() + randomDamageEnemy) - classeJogador.getDefesa();
            	double damageDealt = nivelDeDificuldade.damageModifier((arma.getDano() + classeJogador.getAtaque() + randomDamagePlayer)) - alquimista.getDefesa();
            	vidaJogador = vidaJogador - damageTaken;
            	vidaAlquimista = vidaAlquimista - damageDealt;
            	classeJogador.setVida(vidaJogador);
            	alquimista.setVida(vidaAlquimista);
            	System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString() + " e causou " + damageDealt + " de dano ao inimigo." );
            	System.out.println(alquimista.toString() + cajado.toString() + " e causou " + damageTaken + " de dano ao jogador.");
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
        if (decisao.equals("2")) {
        	System.out.println("Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
        	System.exit(0);
        }
    }
    if (classeJogador.getVida() < 1) {
    	System.out.println("FIM DO JOGO!");
    	System.exit(0);
    }
    System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
    System.out.println("Sua vida depois do combate: " + classeJogador.getVida());
    System.out.println("Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado, pega a garrafa e pondera se deve beber um gole.");
    System.out.println("O que você gostaria de fazer?");
	System.out.println("\t# 1 - Beber");
	System.out.println("\t# 2 - Não beber");
	String pocao = keyboard.nextLine();
    while ((!pocao.equals("1")) && (!pocao.equals("2"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	pocao = keyboard.nextLine();
    }
    if (pocao.equals("1")) { 
    	classeJogador.setVida(120);
    	System.out.println("Você se sente revigorado para seguir adiante!");
    }
    if (pocao.equals("2")) {
    	System.out.println("Você fica receoso de beber algo produzido pelo inimigo.");
    }
    System.out.println("Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa que leva presa ao cinto.");
    System.out.println("De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca no combate que você sabe que irá se seguir, e adentra a porta.");
    System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados às paredes.");
    System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.");
    System.out.println("O que você gostaria de fazer?");
	System.out.println("\t# 1 - Atacar");
	System.out.println("\t# 2 - Esperar");
	String acao = keyboard.nextLine();
    while ((!acao.equals("1")) && (!acao.equals("2"))) {
    	System.out.println("Opção inválida! Digite novamente!");
    	acao = keyboard.nextLine();
    }
    if (acao.equals("1")) { 
    	Enemy lider = new OrcLeader();
        EnemyWeapon machadoduplo = new MachadoInimigo();
        while(lider.getVida() > 0) {
        	System.out.println("Sua vida: " + classeJogador.getVida());
        	System.out.println("Vida do inimigo: " + lider.getVida());
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
            	double vidaLider = lider.getVida();
            	int randomDamagePlayer = 1 + random.nextInt(20);
            	int randomDamageEnemy = 1 + random.nextInt(20);
            	
            	if (dificuldade.equals("1") || dificuldade.equals("2")) {
            	double damageTaken = nivelDeDificuldade.damageModifier((machadoduplo.getDano() + lider.getAtaque() + randomDamageEnemy)) - classeJogador.getDefesa();
            	double damageDealt = (arma.getDano() + classeJogador.getAtaque()  + randomDamagePlayer) - lider.getDefesa();
            	vidaJogador = vidaJogador - damageTaken;
            	vidaLider = vidaLider - damageDealt;
            	classeJogador.setVida(vidaJogador);
            	lider.setVida(vidaLider);
            	System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString() + " e causou " + damageDealt + " de dano ao inimigo." );
            	System.out.println(lider.toString() + machadoduplo.toString() + " e causou " + damageTaken + " de dano ao jogador.");
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
            	if (dificuldade.equals("3")) {
                	double damageTaken = (machadoduplo.getDano() + lider.getAtaque() + randomDamageEnemy) - classeJogador.getDefesa();
                	double damageDealt = nivelDeDificuldade.damageModifier((arma.getDano() + classeJogador.getAtaque() + randomDamagePlayer)) - lider.getDefesa();
                	vidaJogador = vidaJogador - damageTaken;
                	vidaLider = vidaLider - damageDealt;
                	classeJogador.setVida(vidaJogador);
                	lider.setVida(vidaLider);
                	System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString() + " e causou " + damageDealt + " de dano ao inimigo." );
                	System.out.println(lider.toString() + machadoduplo.toString() + " e causou " + damageTaken + " de dano ao jogador.");
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
            if (decisao.equals("2")) {
            	System.out.println("Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
            	System.exit(0);
            }
        }
    }
    if (acao.equals("2")) { 
    	System.out.println("O Orc Líder ataca primeiro!");
    	Enemy lider = new OrcLeader();
        EnemyWeapon machadoduplo = new MachadoInimigo();
        double vidaJogador = classeJogador.getVida();
        int randomDamageEnemy = 1 + random.nextInt(20);
    	double damageTaken = (machadoduplo.getDano() + lider.getAtaque() + randomDamageEnemy) - classeJogador.getDefesa();
    	vidaJogador = vidaJogador - damageTaken;
    	classeJogador.setVida(vidaJogador);
    	System.out.println("O Orc Líder faz um ataque surpresa e causa " + damageTaken + " de dano!");
    	while(lider.getVida() > 0) {
        	System.out.println("Sua vida: " + classeJogador.getVida());
        	System.out.println("Vida do inimigo: " + lider.getVida());
        	System.out.println("O que você gostaria de fazer?");
        	System.out.println("\t# 1 - Lutar");
        	System.out.println("\t# 2 - Fugir");
        	String decisao = keyboard.nextLine();
            while ((!decisao.equals("1")) && (!decisao.equals("2"))) {
            	System.out.println("Opção inválida! Digite novamente!");
            	decisao = keyboard.nextLine();
            }
            if (decisao.equals("1")) { 
            	vidaJogador = classeJogador.getVida();
            	double vidaLider = lider.getVida();
            	int randomDamagePlayer = 1 + random.nextInt(20);
            	randomDamageEnemy = 1 + random.nextInt(20);
            	
            	if (dificuldade.equals("1") || dificuldade.equals("2")) {
            	damageTaken = nivelDeDificuldade.damageModifier((machadoduplo.getDano() + lider.getAtaque() + randomDamageEnemy)) - classeJogador.getDefesa();
            	double damageDealt = (arma.getDano() + classeJogador.getAtaque()  + randomDamagePlayer) - lider.getDefesa();
            	vidaJogador = vidaJogador - damageTaken;
            	vidaLider = vidaLider - damageDealt;
            	classeJogador.setVida(vidaJogador);
            	lider.setVida(vidaLider);
            	System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString() + " e causou " + damageDealt + " de dano ao inimigo." );
            	System.out.println(lider.toString() + machadoduplo.toString() + " e causou " + damageTaken + " de dano ao jogador.");
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
            	if (dificuldade.equals("3")) {
                	damageTaken = (machadoduplo.getDano() + lider.getAtaque() + randomDamageEnemy) - classeJogador.getDefesa();
                	double damageDealt = nivelDeDificuldade.damageModifier((arma.getDano() + classeJogador.getAtaque() + randomDamagePlayer)) - lider.getDefesa();
                	vidaJogador = vidaJogador - damageTaken;
                	vidaLider = vidaLider - damageDealt;
                	classeJogador.setVida(vidaJogador);
                	lider.setVida(vidaLider);
                	System.out.println(classeJogador.toString() + jogador.getNome() + arma.toString() + " e causou " + damageDealt + " de dano ao inimigo." );
                	System.out.println(lider.toString() + machadoduplo.toString() + " e causou " + damageTaken + " de dano ao jogador.");
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
            if (decisao.equals("2")) {
            	System.out.println("Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
            	System.exit(0);
            }
        }
    }
    if (classeJogador.getVida() < 1) {
    	System.out.println("FIM DO JOGO!");
    	System.exit(0);
    }
    System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
    System.out.println("Você conseguiu!");
    if (motivacao.equals("1")) {
    	System.out.println("O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. A glória o aguarda, você a conquistou.");
    }
    if (motivacao.equals("2")) {
    	System.out.println("Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você pode seguir sua vida.");
    }
    System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em direção à noite, retornando à cidade. Seu dever está cumprido.");
    System.out.println("FIM DE JOGO!");
}
}