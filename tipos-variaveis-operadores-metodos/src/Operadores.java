import java.sql.SQLOutput;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);

        numero = - numero; // Convertendo um número positivo em um número negativo.
        System.out.println(numero);

        numero = numero * -1; // Convertendo um número negativo em um número positivo.
        System.out.println(numero);

        int numero2 = 5;

        //x repetição.
        numero2++; // O operador "++" serve para incrementar um número.
        // numero = numero+1; Podemos incrementar um número desta forma também.
        System.out.println(numero2);

        System.out.println( numero2 ++); // Podemos incrementar um número assim também.

        System.out.println( numero -- ); // Podemos também decrementar um número, com o operador "--".

        // Se o valor for true dara false, pois o "!" serve para negação.
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        // System.out.println(!variavel); O operador de "!" serve para negar algo, um operador de negação.
        // System.out.println(variavel); Mesmo ter mudado na linha de cima para "!variavel" o valor vai dar true.
        // Pois não atribuimos o operador de "!" na "variavel".
    }

}
