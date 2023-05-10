abstract class Pessoa { // abstract proíbe instâncias da classe Pessoa
    private int idade;
    private String nome; // o atributo pode ser acessado apenas através de métodos
    private String sexo;
    private Casamento casamento;

    // criação de um novo método construtor
    Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    // é permitido a criação de vários métodos construtores
    Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
        // ou realizar o encadiamento com o construtor principal
        // this(nome, idade, "")
    }

    Pessoa() {
        this("Sem Nome", 0, "");
    }

    // a vantagem de atribuir através de métodos é a utilização de tratamentos
    void setNome(String nome) {
        this.nome = nome;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    void setSexo(String sexo) {
        this.sexo = sexo;
    }

    void setCasamento(Casamento casamento) {
        this.casamento = casamento;
    }

    String getNome() {
        return this.nome;
    }

    int getIdade() {
        return this.idade;
    }

    String getSexo() {
        return this.sexo;
    }

    Casamento getCasamento() {
        return this.casamento;
    }
}