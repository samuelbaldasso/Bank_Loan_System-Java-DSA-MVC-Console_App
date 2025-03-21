package exceptions;

import entities.Conta;

public class EmprestimoNaoAtualizadoExcecao extends IllegalArgumentException {

    public EmprestimoNaoAtualizadoExcecao(String msg) {
        super(msg);
    }

    public static void verificarEmprestimoAtualizado(Conta conta) {
        if (conta.getSaldo() < conta.getLimite() * 0.3) {
            throw new EmprestimoNaoAtualizadoExcecao("O cliente deve ter no mínimo 30% do limite disponível.");
        }
    }
}