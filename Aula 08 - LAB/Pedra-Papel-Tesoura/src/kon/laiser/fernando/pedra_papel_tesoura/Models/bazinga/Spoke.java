package kon.laiser.fernando.pedra_papel_tesoura.Models.bazinga;

import kon.laiser.fernando.pedra_papel_tesoura.Models.Jogada;
import kon.laiser.fernando.pedra_papel_tesoura.Models.classico.Papel;
import kon.laiser.fernando.pedra_papel_tesoura.Models.classico.Pedra;
import kon.laiser.fernando.pedra_papel_tesoura.Models.classico.Tesoura;

public class Spoke extends Jogada {
    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return (jogada instanceof Tesoura) || (jogada instanceof Pedra);
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public String toString() {
        return "Spoke";
    }
}
