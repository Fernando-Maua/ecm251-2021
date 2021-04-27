package kon.laiser.fernando;

public class Papel extends Jogada{
    @Override
    public boolean verificaSeGanhei(Jogada jogada){
        return jogada instanceof Pedra;
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada){
        return jogada instanceof Tesoura;
    }
}
