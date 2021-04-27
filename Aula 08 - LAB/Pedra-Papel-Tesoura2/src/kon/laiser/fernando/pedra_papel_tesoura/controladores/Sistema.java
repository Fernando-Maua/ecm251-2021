package kon.laiser.fernando.pedra_papel_tesoura.controladores;

import kon.laiser.fernando.pedra_papel_tesoura.Models.*;
import kon.laiser.fernando.pedra_papel_tesoura.Models.bazinga.Lagarto;
import kon.laiser.fernando.pedra_papel_tesoura.Models.bazinga.Spoke;
import kon.laiser.fernando.pedra_papel_tesoura.Models.classico.Papel;
import kon.laiser.fernando.pedra_papel_tesoura.Models.classico.Pedra;
import kon.laiser.fernando.pedra_papel_tesoura.Models.classico.Tesoura;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private Jogador jogador1;
    private Jogador jogador2;
    private Scanner scanner;
    private final Jogada[] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura(), new Spoke(), new Lagarto()};

    public Sistema() {
        scanner = new Scanner(System.in);
        inicializaJogadores();
    }

    private void inicializaJogadores() {
        System.out.println("Informe o nome do jogador 1:");
        String nome = scanner.next();
        jogador1 = new Jogador(nome, true);
        jogador2 = new Jogador("NPC");
    }

    public void run(){
        while(true){
            System.out.println("Player1:"+jogador1 + " vs Player2:"+jogador2);
            jogador1.setJogada(selecionaJogada());
            jogador2.setJogada(sorteiaJogada());
            System.out.println("Jogada Jogador 1:" + jogador1.getJogada());
            System.out.println("Jogada Jogador 2:" + jogador2.getJogada());
            System.out.println("Resultado:" + jogador1.getJogada().verificaResultado(jogador2.getJogada()));
        }
    }

    private Jogada selecionaJogada() {
        System.out.println("Escolha:");
        for (int i = 0; i < jogadas.length; i++) {
            System.out.println(""+i+" - "+jogadas[i]);
        }
        int escolha = scanner.nextInt();
        return jogadas[escolha];
    }

    private Jogada sorteiaJogada() {
        return jogadas[new Random().nextInt(jogadas.length)];
    }
}