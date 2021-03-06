package kon.laiser.fernando.Models;


import kon.laiser.fernando.Enums.HorarioSistema;
import kon.laiser.fernando.Enums.TiposMembros;

public class MobileMembers extends Membro{

    public MobileMembers(String nome, String email, TiposMembros funcao){
        super(nome, email, funcao);

    }


    @Override
    public void ExibirRelatorio() {
        System.out.println(
                "Eu sou o "         +getNome()+
                        " de email "        +getEmail()+
                        " com a Função de " +getFuncao()
        );


    }

    @Override
    public void Mensagem(HorarioSistema horario) {
        switch (horario) {
            default:
                break;
            case Regular:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("Happy Coding!\n");
                break;

            case Extra:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("Happy_C0d1ng. Maskers.\n");
                break;
        }


    }
}