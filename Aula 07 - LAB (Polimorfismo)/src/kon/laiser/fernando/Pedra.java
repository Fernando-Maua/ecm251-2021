package kon.laiser.fernando;

public class Pedra extends Jogada{
    @Override
    public boolean verificaSeGanhei(Jogada jogada){
        return jogada instanceof Tesoura;
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada){
        return jogada instanceof Papel;
    }
}
