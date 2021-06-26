package kon.laiser.fernando.Controle;


import kon.laiser.fernando.Enums.HorarioSistema;
import kon.laiser.fernando.Models.Acoes.Escolha;
import kon.laiser.fernando.Models.Acoes.Horario;

import java.util.Scanner;

public class Sistema {
    public static void run() {
        Scanner input = new Scanner(System.in);
        Escolha escolha = new Escolha();
        Horario horario = new Horario();

        do {
            System.out.println("******* Bem Vindo ao Mask_Society *******\n");

            System.out.println("Você está no horário de trabalho " + horario.getHorario());
            System.out.println("Escolha uma atividade:\n");
            System.out.println("Cadastrar (1)");
            System.out.println("Postar mensagem (2)");
            System.out.println("Perguntar o horário de trabalho (3)");
            System.out.println("Trocar o horário de trabalho (4)");
            System.out.println("Encerrar (0)");

            escolha.Escolher(input.nextLine());

        }while(input.nextLine()!= "0");
    }

}
