package kon.laise.fernando;

public class Basico01 {
    //Tipos primitivos
    public static void main(String[] args) {
        int hp;
        boolean megaEvolui;
        float atk;
        double satk;
        String nome;

        //Atribuições
        hp = 100;
        megaEvolui = true;
        atk = 50f;
        satk = 55.0;
        nome = "gengar";

        System.out.println("Nome:" + nome);
        System.out.println("Mega Evolui:" + megaEvolui);
        System.out.println("Ataque:" + atk + "\nAtk Especial:" + satk);
    }
}
