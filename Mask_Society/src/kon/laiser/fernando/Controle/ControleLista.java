package kon.laiser.fernando.Controle;

import kon.laiser.fernando.Models.Membro;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ControleLista {
    private ArrayList<Membro> ListaDeMembros = new ArrayList<Membro>();

    //getter
    public ArrayList<Membro> getListaDeMembros() throws IOException {
        File file = new File("arquivo_super_Secreto_nao_abrir.csv");
        Scanner sc = new Scanner(file);
        try {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        return null;
    }

    public void AddMembro(Membro membro){
        this.ListaDeMembros.add(membro);
    }

    public void RemoverMembro(Membro membro){
        this.ListaDeMembros.remove(membro);

    }
}
