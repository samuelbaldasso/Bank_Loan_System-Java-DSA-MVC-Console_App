import entities.Cliente;
import entities.Conta;
import entities.Emprestimo;
import exceptions.EmprestimoNaoAtualizadoExcecao;
import exceptions.IdadeExcecao;
import exceptions.RendaExcecao;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fulano", "123.456.789-00", "Desenvolvedor", 25, 2000, false);
        Emprestimo emprestimo = new Emprestimo(cliente, 1000, 30, 0.3);
        Conta conta = new Conta(cliente, 1000, 500, 123);

        try {
            emprestimo.solicitar(conta.getSaldo(), conta);
        } catch (EmprestimoNaoAtualizadoExcecao | IdadeExcecao | RendaExcecao e) {
            System.out.println("Erro ao solicitar empréstimo: " + e.getMessage());
        }

        emprestimo.consultarTudo();
    }
}