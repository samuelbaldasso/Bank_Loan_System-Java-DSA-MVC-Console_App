package exceptions;

/*
Pensar em exceções:
E se a renda for R$ 2.499,99?
E se o cliente quitar uma dívida, o percentual de comprometimento baixa, mas o sistema não atualiza?
 */

public class IdadeExcecao extends Exception {
    public static void verificarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("O cliente deve ser maior de idade.");
        }
        if (idade > 65) {
            throw new IllegalArgumentException("O cliente deve ser menor de 65 anos.");
        }
    }
}



