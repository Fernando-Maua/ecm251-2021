package kon.laiser.fernando.Models;

import kon.laiser.fernando.Enums.HorarioSistema;
import kon.laiser.fernando.Enums.TiposMembros;

public class HeavyLifters extends Membro{

    public HeavyLifters(String nome, String email, TiposMembros funcao){
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

    public void Mensagem(HorarioSistema horario) {
        switch (horario) {
            default:
                break;
            case Regular:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("Podem contar conosco!\n");
                break;

            case Extra:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("N00b_qu3_n_Se_r3pita.bat\n");
                break;
        }


    }
}
