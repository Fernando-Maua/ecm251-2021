package kon.laiser.fernando;

public class Pessoa {
    private final String nome;
    private final String cpf;
    public int mudar;

    // Construtor
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String Ola(){
        return "Olá! Eu sou " + this.nome;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", CPF='" + cpf + '\'' +
                ", mudar=" + mudar +
                '}';
    }
}
