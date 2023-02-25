public class TiposVariaveis {
    public static void main(String[] args) {
        // Estudar Tipos primitivos e Classe String que representa texto na aplicação.
        double salarioMinimo = 2500;
        byte idade = 123; // "byte" armazena -123 a 123.
        short ano = 2021; // "short" armazena -32.768 a 32.768.
        int cep = 21070333; // "int" armazena -2.147.483.648 a 2.147.483.648.
        int cep2 = 21070333; // Se começar com 0, talvez o Java não armazene.
        long cpf = 45332289820L; // "long" armazena um número absurdo.
        float pi = 3.14F;
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Converter para outro tipo, se chama "Cast".

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // "final" significa que é uma constante, ela não pode ter o valor alterado.
    }
}