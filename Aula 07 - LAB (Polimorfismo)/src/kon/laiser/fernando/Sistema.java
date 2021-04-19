package kon.laiser.fernando;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private Jogador jogador1;
    private Jogador jogador2;
    private Scanner scanner;
    private final Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};

    public Sistema(){
        scanner = new Scanner(System.in);
        inicializaJodadores();
    }

    private void inicializaJodadores(){
        System.out.println("Informe o nome do Jogador 1:");
        String nome = scanner.next();
        jogador1 = new Jogador(nome, true);
        jogador2 = new Jogador("NPC");
    }

    public void run(){
        while(true){
            System.out.println("Player 1:" + jogador1 + "vs Player 2:" + jogador2);
            jogador1.setJogada(selecionaJogada());
            jogador2.setJogada(sorteiaJogada());
            System.out.println("Jogada jogador 1:" + jogador1.getJogada());
            System.out.println("Jogada jogador 1:" + jogador2.getJogada());
            System.out.println("Resultado:" + jogador1.getJogada().verificaResultado(jogador2.getJogada();));
        }
    }

    private Jogada selecionaJogada() {
        System.out.println("Escolha:\n0 - Pedra\n1 - Papel\n2 - Tesoura");
        int escolha = scanner.nextInt();
        Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};
        return jogadas;
    }

    private Jogada sorteiaJogada() {
        Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};
        return jogadas[new Random().nextInt(jogadas.length)];
    }
}
