package kon.laiser.fernando.Controle;

import kon.laiser.fernando.Enums.HorarioSistema;
import kon.laiser.fernando.Models.Acoes.Cadastro;

import java.util.Scanner;

public class Sistema {
    final private static Scanner scanner = new Scanner(System.in);
    private static HorarioSistema HoraAtual = HorarioSistema.Regular;

    public static void run() {
        boolean running = true;


        while(running){
            System.out.println("******* Bem Vindo ao Mask_Society *******\n");
            System.out.println(

                    "--------MENU DE OPÇÕES--------\n" +
                            "HORARIO ATUAL: " + HoraAtual + "\n" +
                            "1 - Cadastrar um novo Membro:\n"+
                            "2 - Postar mensagem\n" +
                            "3 - Trocar o horário de trabalho\n" +
                            "4 - Verificar Horário\n"+
                            "5 - Encerrar o Sistema\n"+
                            "Digite a sua Opção: "
            );
            int input = scanner.nextInt();
            switch (input){
                case 1 :
                    Cadastro cadastro = new Cadastro();
                    cadastro.Cadastrar();
                    break;
                case 2 :
                    System.out.println("Postar mensagem");
                case 3:
                    if(HoraAtual == HorarioSistema.Regular) {
                        HoraAtual = HorarioSistema.Extra    ;
                    }
                    else {
                        HoraAtual = HorarioSistema.Regular;
                    }
                    break;
                case 4 :
                    System.out.println("Você está no horário: " + HoraAtual);
                    break;
                case 5:
                    System.out.println("Encerrando Sistema ...");;
                    running = false;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;

            }
        }
    }
}
