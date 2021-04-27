package kon.laiser.fernando.pedra_papel_tesoura.Models.classico;

import kon.laiser.fernando.pedra_papel_tesoura.Models.Jogada;
import kon.laiser.fernando.pedra_papel_tesoura.Models.bazinga.Lagarto;
import kon.laiser.fernando.pedra_papel_tesoura.Models.bazinga.Spoke;

public class Papel extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    }

    @Override
    public String toString() {
        return "Papel";
    }
}
