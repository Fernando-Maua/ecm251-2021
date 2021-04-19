package kon.laiser.fernando;

public class Main {

    public static void main(String[] args) {
        final Pessoa  pessoa = new Pessoa("Deku", "1234");
        pessoa.mudar = 62;
        System.out.println(pessoa);
        // Não pode realizar a nova instância, pois a referência é final
        //pessoa = new Pessoa("Bakugo", "1233");
        pessoa.mudar = 14;
        System.out.println(pessoa);

        // Exemplo de sobrecarga
        System.out.println("------SOBRECARGA------");
        Estudante estudante1 = new Estudante("Asuka", "02", "02");
        Estudante estudante2 = new Estudante("Rei", "01");
        System.out.println(estudante1);
        System.out.println(estudante2);

        // Exemplo de sobreposição
        System.out.println("------SOBREPOSIÇÃO------");
        Pessoa pessoa1 = new Estudante("Shinji", "33", "01");
        Estudante estudante3 = new Estudante("Kaoru", "44", "02");
        Object estudante4 = new Estudante("Han Solo", "00", "00");
        System.out.println("Estudante como pessoa: " + pessoa1);
        System.out.println("Estudante como estudante: " + estudante3);
        System.out.println("Estudante como object: " + estudante4);

        // IMPORTANTE
        System.out.println("--------Cuidado com a Herança:-------");
        System.out.println("Olá de Estudante como Pessoa:" + pessoa1.Ola());
        System.out.println("Olá de Estudante como Estudante:" + estudante3.Ola());
        System.out.println("Olá de Estudante como Object:" + ((Estudante)estudante4).Ola());

    }
}
