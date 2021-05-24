package kon.laiser.fernando.linked_list_test_drive;

import jdk.swing.interop.SwingInterOpUtils;
import kon.laiser.fernando.Models.Conta;
import kon.laiser.fernando.Models.Pessoas;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<Pessoas> pessoas = new LinkedList<>();
        pessoas.add(new Pessoas("Midoria", "999"));
        pessoas.add(new Pessoas("Bakugo", "998"));
        pessoas.add(new Pessoas("Todoroki", "997"));
        pessoas.add(0,new Pessoas("Uraraka", "1000"));
        pessoas.addFirst(new Pessoas("AllMight", "001"));

        System.out.println("Pessoas");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        LinkedList<Conta> contas = new LinkedList<>();
        contas.addAll(Arrays.asList(new Conta(10), new Conta(20), new Conta(25)));
        System.out.println("Passa pela lista de Contas:");
        contas.forEach(conta -> System.out.println(conta));
    }
}
