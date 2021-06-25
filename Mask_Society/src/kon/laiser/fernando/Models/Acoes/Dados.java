package kon.laiser.fernando.Models.Acoes;

public class Dados {
    final public String funcao;
    final public String nome;
    final public String ID;

    /**
     * Construtor do elemento item
     * @param funcao
     * @param nome
     * @param ID
     */
    public Dados(String funcao, String nome, String ID) {
        this.funcao = funcao;
        this.nome = nome;
        this.ID = ID;
    }

    /**
     * Método que representa o estado do objeto item
     * @return
     */
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + funcao + '\'' +
                "nome='" + nome + '\'' +
                ", email=" + ID +
                '}';
    }

    /**
     * Método que cria um objeto Dados dada a uma string de entrada
     * @param dados String com os valores da funcao, do nome e do ID
     * @return Uma instância de dados
     */
    public static Dados pegaDados(String dados){
        return new Dados(dados.split(";")[0], dados.split(";")[1], dados.split(";")[2]);
    }
}
