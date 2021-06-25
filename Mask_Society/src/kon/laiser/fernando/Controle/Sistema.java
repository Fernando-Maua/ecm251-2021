package kon.laiser.fernando.Controle;


import kon.laiser.fernando.Models.Acoes.Escolha;

import java.util.Scanner;

public class Sistema {
    public static void run() {
        Scanner input = new Scanner(System.in);
        Escolha escolha = new Escolha();

        do {
            System.out.println("******* Bem Vindo ao Mask_Society *******\n");
            System.out.println("Escolha uma atividade:\n");
            System.out.println("Cadastrar (1)");
            System.out.println("Postar mensagem (2)");
            System.out.println("Trocar o horário de trabalho (3)");
            System.out.println("Encerrar (4)");

            escolha.Escolher(input.nextLine());

        }while(input.nextLine()!= "4");
    }

}
