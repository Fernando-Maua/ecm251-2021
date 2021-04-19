package kon.laiser.fernando;

public class Tesoura extends Jogada{
    @Override
    public boolean verificaSeGanhei(Jogada jogada){
        return jogada instanceof Papel;
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada){
        return jogada instanceof Pedra;
    }
}
