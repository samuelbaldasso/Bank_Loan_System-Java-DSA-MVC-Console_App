package entities;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private String profissao;
    private long rendaMensal;
    private boolean negativado;

    public Cliente(String nome, String cpf, String profissao, int idade, long rendaMensal, boolean negativado) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.idade = idade;
        this.rendaMensal = rendaMensal;
        this.negativado = negativado;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public int getIdade() {
        return idade;
    }

    public long getRendaMensal() {
        return rendaMensal;
    }

    public boolean isNegativado() {
        return negativado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRendaMensal(long rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public void setNegativado(boolean negativado) {
        this.negativado = negativado;
    }

    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nProfissão: " + profissao + "\nIdade: " + idade + "\nRenda Mensal: " + rendaMensal + "\nNegativado: " + negativado;
    }

}
