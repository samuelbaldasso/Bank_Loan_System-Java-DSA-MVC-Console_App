package entities;

public class Conta {
    private Cliente cliente;
    private double saldo;
    private double limite;
    private int numero;

    public Conta(Cliente cliente, double saldo, double limite, int numero) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(Conta destino, double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            destino.depositar(valor);
        }
    }

    public void consultarTudo() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("Número: " + numero);
    }
}
