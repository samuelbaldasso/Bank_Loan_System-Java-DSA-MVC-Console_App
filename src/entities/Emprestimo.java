package entities;
import exceptions.EmprestimoNaoAtualizadoExcecao;
import exceptions.IdadeExcecao;
import exceptions.RendaExcecao;

public class Emprestimo {
    private Cliente cliente;
    private double valor;
    private int parcelas;
    private double juros;

    public Emprestimo(Cliente cliente, double valor, int parcelas, double juros) {
        this.cliente = cliente;
        this.valor = valor;
        this.parcelas = parcelas;
        this.juros = juros;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public double getJuros() {
        return juros;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double calcularJuros() {
        return valor * juros * parcelas;
    }

    public double calcularTotal() {
        return valor + calcularJuros();
    }

    public double calcularParcela() {
        return calcularTotal() / parcelas;
    }

    public boolean isAprovado(Conta conta) {
        return verificarIdade() && verificarRenda() && verificarNegativado() && verificarEmprestimos(conta);
    }

    public void solicitar(double valor, Conta conta) throws EmprestimoNaoAtualizadoExcecao, IdadeExcecao, RendaExcecao {
        if (isAprovado(conta)) {
            System.out.println("Empréstimo aprovado");
            conta.depositar(valor);
        } else {
            System.out.println("Empréstimo negado");
        }
    }

    public void pagarParcela(Conta conta) {
        if (conta.getSaldo() >= calcularParcela()) {
            conta.sacar(calcularParcela());
            parcelas--;
            System.out.println("Parcela paga");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void pagarTudo(Conta conta) {
        if (conta.getSaldo() >= calcularTotal()) {
            conta.sacar(calcularTotal());
            parcelas = 0;
            System.out.println("Empréstimo quitado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public boolean verificarIdade() {
        return cliente.getIdade() >= 18 && cliente.getIdade() <= 65;
    }

    public boolean verificarRenda() {
        return cliente.getRendaMensal() >= 2500;
    }

    public boolean verificarNegativado() {
        return !cliente.isNegativado();
    }

    public boolean verificarEmprestimos(Conta conta) {
        return conta.getSaldo() >= calcularTotal() * 30 / 100;
    }

    public void consultarTudo() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Valor: " + valor);
        System.out.println("Parcelas: " + parcelas);
        System.out.println("Juros: " + juros);
        System.out.println("Juros do empréstimo: " + calcularJuros());
        System.out.println("Total do empréstimo: " + calcularTotal());
        System.out.println("Parcela do empréstimo: " + calcularParcela());
    }

    public void consultarCliente() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Negativado: " + cliente.isNegativado());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Renda mensal: " + cliente.getRendaMensal());
    }

    public void consultarEmprestimo() {
        System.out.println("Valor: " + valor);
        System.out.println("Parcelas: " + parcelas);
        System.out.println("Juros: " + juros);
        System.out.println("Juros do empréstimo: " + calcularJuros());
        System.out.println("Total do empréstimo: " + calcularTotal());
        System.out.println("Parcela do empréstimo: " + calcularParcela());
    }

    public void consultarParcelas() {
        System.out.println("Parcelas restantes: " + parcelas);
    }

    public void consultarSaldo(Conta conta) {
        System.out.println("Saldo da conta: " + conta.getSaldo());
    }

    public void consultarTudo(Conta conta) {
        consultarTudo();
        consultarCliente();
        consultarEmprestimo();
        consultarParcelas();
        consultarSaldo(conta);
    }
}
