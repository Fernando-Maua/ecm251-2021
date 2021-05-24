package kon.laiser.fernando.Models;

/**
 * Modelo utilizado para representar uma pessoa com nome e cpf
 */
public class Pessoas {
    final public String nome;
    final public String cpf;

    /**
     * Construtor que inicializa os atributos da classe
     * @param nome Nome da pessoa
     * @param cpf Cpf da pessoa
     */
    public Pessoas(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Representa o estado do objeto
     * @return Devolve os valores de nome e cpf
     */
    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
