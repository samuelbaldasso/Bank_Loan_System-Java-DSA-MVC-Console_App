package exceptions;

import entities.Conta;

public class EmprestimoNaoAtualizadoExcecao extends Exception {
    public static void verificarEmprestimoAtualizado(Conta conta) {
        if (conta.getSaldo() < conta.getLimite() * 0.3) {
            throw new IllegalArgumentException("O cliente deve ter no mínimo 30% do limite disponível.");
        }
    }
}