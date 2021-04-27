package kon.laiser.fernando.pedra_papel_tesoura.Models.classico;

import kon.laiser.fernando.pedra_papel_tesoura.Models.Jogada;
import kon.laiser.fernando.pedra_papel_tesoura.Models.bazinga.Lagarto;
import kon.laiser.fernando.pedra_papel_tesoura.Models.bazinga.Spoke;

public class Tesoura extends Jogada {
    @Override
    public boolean verificaSeGanhei(Jogada jogada){
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada){
        return (jogada instanceof Spoke) || (jogada instanceof Pedra);
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
