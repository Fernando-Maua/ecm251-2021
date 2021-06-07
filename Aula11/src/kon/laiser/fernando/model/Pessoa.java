package kon.laiser.fernando.model;

public abstract class Pessoa {
    private String nome;
    private String cpf;

    /**
     * Método construtor da classe pessoa que inicializa seus parêmtros.
     * @param nome Nome atribuido a instância de pessoa.
     * @param cpf Cpf atribuido a instância de pessoa.
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Método construtor alternativo para classe <strong>Pessoa</strong>. Inicializa o atributo nome com uma String vazia.
     * @param cpf Cpf atribuido a instância de pessoa.
     */
    public Pessoa(String cpf){
        this.nome = "";
        this.cpf = cpf;
    }

    /**
     * Getter do valor nome da instância de pessoa.
     * @return O valor do atributo nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @return Valor do atributo cpf.
     */
    public String getCpf() {
        return cpf;
    }
}