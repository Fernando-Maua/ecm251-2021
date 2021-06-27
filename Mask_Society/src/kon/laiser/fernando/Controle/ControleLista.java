package kon.laiser.fernando.Controle;

import kon.laiser.fernando.Models.Acoes.Dados;
import kon.laiser.fernando.Models.Membro;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ControleLista {
    private ArrayList<Membro> ListaDeMembros = new ArrayList<Membro>();

    //getter
    public ArrayList<Membro> getListaDeMembros() {
        return ListaDeMembros;
    }

    public void AddMembro(Membro membro){
        this.ListaDeMembros.add(membro);
    }

    public void RemoverMembro(Membro membro){
        this.ListaDeMembros.remove(membro);
    }
    public void Limpa()throws IOException {
        Writer out = new FileWriter("Dados.txt");

        //limpa
        out.write("");
        out.flush();

        //escreve
        out.flush();
        out.close();
    }


    public void excluir(ArrayList listaDeMembros)throws IOException {
        Scanner ler = new Scanner(System.in);
        int i;
        //Exibi a lista de membros
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
        //Fala com o usuário
        System.out.printf("\nInforme a posição a ser excluída por ID:\n");
        i = ler.nextInt();

        try {
            listaDeMembros.remove(i);
        } catch (IndexOutOfBoundsException e) {
            // exceção lançada para indicar que um índice (i)
            // está fora do intervalo válido
            System.out.printf("\nErro: posição inválida (%s).\n\n",
                    e.getMessage());
        }
    }

    public void exportar(ArrayList listaDeMembros) throws IOException {
        FileWriter fw = new FileWriter("Dados.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        int i, n = listaDeMembros.size();
        for (i=0; i<n; i++) {
            bw.write(listaDeMembros.toString());
        }
    }
}


