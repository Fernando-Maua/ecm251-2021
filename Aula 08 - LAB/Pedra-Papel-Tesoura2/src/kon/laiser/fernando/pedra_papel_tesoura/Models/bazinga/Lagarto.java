package kon.laiser.fernando.pedra_papel_tesoura.Models.bazinga;

import kon.laiser.fernando.pedra_papel_tesoura.Models.Jogada;
import kon.laiser.fernando.pedra_papel_tesoura.Models.classico.Papel;
import kon.laiser.fernando.pedra_papel_tesoura.Models.classico.Pedra;
import kon.laiser.fernando.pedra_papel_tesoura.Models.classico.Tesoura;

public class Lagarto extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Spoke(), new Papel()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }

    @Override
    public String toString() {
        return "Lagarto";
    }
}
