package kon.laiser.fernando.Models;

import kon.laiser.fernando.Enums.HorarioSistema;
import kon.laiser.fernando.Enums.TiposMembros;
import kon.laiser.fernando.Interfaces.IApresentacao;
import kon.laiser.fernando.Interfaces.IPostarMensagem;

public class ScriptGuys extends Membro{

    public ScriptGuys(String nome, String email, TiposMembros funcao){
        super(nome, email, funcao);

    }


    @Override
    public void ExibirRelatorio() {System.out.println(
            "Eu sou o "         +getNome()+
                    " de email "        +getEmail()+
                    " com a Função de " +getFuncao()+"\n"
    );

    }

    @Override
    public void Mensagem(HorarioSistema horario){
        switch (horario) {
            default:
                break;
            case Regular:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("Prazer em ajudar novos amigos de código!\n");
                break;

            case Extra:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("QU3Ro_S3us_r3curs0s.py\n");
                break;
        }

    }
}
