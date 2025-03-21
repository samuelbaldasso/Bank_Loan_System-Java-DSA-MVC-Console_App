package exceptions;

public class RendaExcecao extends Exception {
    public static void verificarRenda(long rendaMensal) {
        if (rendaMensal < 2500) {
            throw new IllegalArgumentException("A renda mensal do cliente deve ser de no mínimo R$ 2.500,00.");
        }
    }
}
