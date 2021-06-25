package kon.laiser.fernando.Models;

import kon.laiser.fernando.Interfaces.IApresentacao;
import kon.laiser.fernando.Interfaces.IPostarMensagem;

public abstract class Member implements IApresentacao, IPostarMensagem {
    String nome;
    String email;
    String funcao;

    public Member(String nome, String email, String funcao){
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
    }

    @Override
    public void exibirRelatorio() {

    }

    @Override
    public void postarMensagem() {

    }
}
