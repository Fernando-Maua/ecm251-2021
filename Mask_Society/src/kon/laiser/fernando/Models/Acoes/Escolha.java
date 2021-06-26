package kon.laiser.fernando.Models.Acoes;


import kon.laiser.fernando.Enums.HorarioSistema;

public class Escolha {
    String escolha;

    public Escolha() {
        this.escolha = escolha;
    }

    public void Escolher (String escolha) {
        switch (escolha){
            case "1":
                Cadastro cadastro = new Cadastro();
                cadastro.Cadastrar();
                System.out.println("Aperte Enter para continuar!");
                break;
            case "2":
                System.out.println("Posta mensagem com assinatura");
                System.out.println("Aperte Enter para continuar!");
                break;
            case "3":
                Horario horario = new Horario();
                System.out.println("Você está no horário " );
                System.out.println("Aperte Enter para continuar!");
                break;
            case "4":
                Horario troca = new Horario();
                troca.definirHorario();
                System.out.println("Aperte Enter para continuar!");
                break;
            case "0":
                System.out.println("Encerrando o sistema ...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }
}
