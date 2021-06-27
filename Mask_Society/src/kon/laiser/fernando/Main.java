package kon.laiser.fernando;

import kon.laiser.fernando.Controle.ControleLista;
import kon.laiser.fernando.Controle.Sistema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {
        ControleLista clear = new ControleLista();
        clear.Limpa();
        Sistema sistema = new Sistema();
        sistema.run();
    }

}
