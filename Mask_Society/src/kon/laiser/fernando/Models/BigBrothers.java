package kon.laiser.fernando.Models;

import kon.laiser.fernando.Enums.HorarioSistema;
import kon.laiser.fernando.Enums.TiposMembros;

public class BigBrothers extends Membro{

    public BigBrothers(String nome, String email, TiposMembros funcao){
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
                System.out.println("Sempre ajudando as pessoas membros ou não S2!\n");
                break;

            case Extra:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("...\n");
                break;
        }
    }
}