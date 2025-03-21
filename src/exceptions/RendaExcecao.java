package exceptions;

public class RendaExcecao extends IllegalArgumentException {
    public RendaExcecao(String msg) {
        super(msg);
    }

    public static void verificarRenda(long rendaMensal) {
        if (rendaMensal < 2500) {
            throw new RendaExcecao("A renda mensal do cliente deve ser de no mínimo R$ 2.500,00.");
        }
    }
}
