package kon.laiser.fernando.Models.Acoes;

public class Dados extends Object {
    final public String funcao;
    final public String nome;
    final public String email;

    /**
     * Construtor do elemento item
     * @param funcao
     * @param nome
     * @param email
     */
    public Dados(String funcao, String nome, String email) {
        this.funcao = funcao;
        this.nome = nome;
        this.email = email;
    }

    public static void add(String linha) {
    }

    /**
     * Método que representa o estado do objeto item
     * @return
     */
    @Override
    public String toString() {
        return "Dados{" +
                "funcao='" + funcao + '\'' +
                "nome='" + nome + '\'' +
                ", email=" + email +
                '}';
    }

    /**
     * Método que cria um objeto Dados dada a uma string de entrada
     * @param dados String com os valores da funcao, do nome e do email
     * @return Uma instância de dados
     */
    public static Dados pegaDados(String dados){
        return new Dados(dados.split(";")[0], dados.split(";")[1], dados.split(";")[2]);
    }
}
