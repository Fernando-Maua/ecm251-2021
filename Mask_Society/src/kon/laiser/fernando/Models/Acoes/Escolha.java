package kon.laiser.fernando.Models.Acoes;


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
                System.out.println("Troca horario");
                System.out.println("Aperte Enter para continuar!");
                break;
            case "4":
                System.out.println("Encerrando o sistema ...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }
}
