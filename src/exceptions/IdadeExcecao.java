package exceptions;

public class IdadeExcecao extends IllegalArgumentException {
    public static void verificarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("O cliente deve ser maior de idade.");
        }
        if (idade > 65) {
            throw new IllegalArgumentException("O cliente deve ser menor de 65 anos.");
        }
    }
}



