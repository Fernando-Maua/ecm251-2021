package kon.laiser.fernando.Controle;

import kon.laiser.fernando.Enums.HorarioSistema;
import kon.laiser.fernando.Interfaces.IPostarMensagem;
import kon.laiser.fernando.Models.Acoes.Cadastro;
import kon.laiser.fernando.Models.Membro;

import java.io.IOException;
import java.util.Scanner;

public class Sistema{
    final private static Scanner scanner = new Scanner(System.in);

    final private static ControleLista lista = new ControleLista();
    private static HorarioSistema HoraAtual = HorarioSistema.Regular;


    public static void run() throws InterruptedException, IOException {
        boolean running = true;


        while(running){
            System.out.println("******* Bem Vindo ao Mask_Society *******\n");
            System.out.println(

                    "--------MENU DE OPÇÕES--------\n" +
                            "HORARIO ATUAL: " + HoraAtual + "\n" +
                            "1 - Cadastrar um novo Membro.\n"+
                            "2 - Exibir Relatório de Informações.\n" +
                            "3 - Postar mensagem.\n" +
                            "4 - Remover um Membro.\n" +
                            "5 - Verificar Horário\n"+
                            "6 - Trocar o horário de trabalho.\n" +
                            "7 - Encerrar o Sistema.\n"+
                            "Digite a sua Opção: "
            );

            int input = scanner.nextInt();
            switch (input){
                case 1 :
                    Cadastro cadastro = new Cadastro();
                    Membro membro = cadastro.Listar();
                    lista.AddMembro(membro);
                    System.out.println("Membro Adicionado!");

                    System.out.println("Press Enter to Continue...");
                    System.in.read();
                    break;


                case 2:
                    lista.getListaDeMembros();

                    System.out.println("Press Enter to Continue...");
                    System.in.read();
                    break;


                case 3:
                    for(Membro membros : lista.getListaDeMembros())
                        membros.Mensagem(HoraAtual);

                    System.out.println("Press Enter to Continue...");
                    System.in.read();
                    break;

                case 4:
                    try {
                        for (int i = 0; i < lista.getListaDeMembros().size(); i++) {
                            System.out.println("MEMBRO " + i + " :");
                            lista.getListaDeMembros().get(i).ExibirRelatorio();
                        }
                        System.out.println("Escolha um Membro para Remover: ");

                        int remove = scanner.nextInt();
                        if (remove < lista.getListaDeMembros().size()) {
                            lista.RemoverMembro(lista.getListaDeMembros().get(remove));
                            System.out.println("Membro " + remove + "Removido Com Sucesso!");

                        } else {
                            System.out.println("Opção Invalida.");
                        }
                    }catch (IOException e){
                        System.out.println("Algo deu errado!");
                    }


                    System.out.println("Press Enter to Continue...");
                    System.in.read();
                    break;

                case 5:
                    System.out.println("Estamos em Horário: " + HoraAtual + ".\n");

                    System.out.println("Press Enter to Continue...");
                    System.in.read();
                    break;

                case 6:
                    if(HoraAtual == HorarioSistema.Regular) {
                        HoraAtual = HorarioSistema.Extra;
                    } else {
                        HoraAtual = HorarioSistema.Regular;
                    }
                    System.out.println("Troca De Horário Realizada com Sucesso.\n");
                    System.out.println("Agora Estamos em Horario:"+HoraAtual);

                    System.out.println("Press Enter to Continue...");
                    System.in.read();
                    break;

                case 7:
                    System.out.println("Encerrando Sistema...");
                    running = false;
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;

            }
        }
    }
}