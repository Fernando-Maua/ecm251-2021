package kon.laiser.fernando.pedra_papel_tesoura.Models.classico;

import kon.laiser.fernando.pedra_papel_tesoura.Models.Jogada;
import kon.laiser.fernando.pedra_papel_tesoura.Models.bazinga.Lagarto;
import kon.laiser.fernando.pedra_papel_tesoura.Models.bazinga.Spoke;

public class Tesoura extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
