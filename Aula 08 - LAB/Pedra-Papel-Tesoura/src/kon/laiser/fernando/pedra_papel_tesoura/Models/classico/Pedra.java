package kon.laiser.fernando.pedra_papel_tesoura.Models.classico;

import kon.laiser.fernando.pedra_papel_tesoura.Models.Jogada;

public class Pedra extends Jogada {
    @Override
    public boolean verificaSeGanhei(Jogada jogada){
        return jogada instanceof Tesoura;
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada){
        return jogada instanceof Papel;
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}
