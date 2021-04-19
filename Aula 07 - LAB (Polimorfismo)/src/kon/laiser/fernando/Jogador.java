package kon.laiser.fernando;

public class Jogador {
    private String nome;
    private boolean ehHumano;

    public Jogador(String nome, boolean ehHumano){
        this.nome = nome;
        this.ehHumano = ehHumano;
    }

    public Jogador(String nome){
        this.nome = nome;
        this.ehHumano = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean getEhHumano() {
        return ehHumano;
    }

    public void getJogada(){
        this.jogada = jogada;
    }
    public void setJogada(Jogada jogada){
        this.jogada = jogada;
    }
}
