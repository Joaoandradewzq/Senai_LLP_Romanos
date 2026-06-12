import java.util.Scanner;

/**
 * Classe responsável por converter números romanos em inteiros.
 *
 * A lógica percorre a string de símbolos romanos da esquerda para a direita. Para cada
 * símbolo, compara o valor do símbolo atual com o próximo: se o valor atual for
 * menor, subtrai-se; caso contrário, soma-se. Essa abordagem garante o
 * tratamento correto das combinações de subtração (IV, IX, XL, XC, CD, CM).
 */
public class RomanoParaInt {

    /**
     * Converte um numeral romano em um número inteiro.
     *
     * @param s String contendo o numeral romano. É ignorada distinção entre
     *          minúsculas e maiúsculas e são removidos espaços extras.
     * @return valor inteiro correspondente ao numeral romano.
     * @throws IllegalArgumentException se a string contiver caracteres
     *                                  inválidos que não pertencem ao sistema romano.
     */
    public static int AlgarismoRomanoParaInteiro(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        // Normaliza a entrada: remove espaços e converte para maiúsculas.
        s = s.trim().toUpperCase();

        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int atual = valorRomano(s.charAt(i));

            // Se houver um próximo símbolo e o valor atual for menor, subtrai.
            if (i + 1 < length) {
                int proximo = valorRomano(s.charAt(i + 1));
                if (atual < proximo) {
                    total -= atual;
                } else {
                    total += atual;
                }
            } else {
                // Último símbolo: soma sempre.
                total += atual;
            }
        }

        return total;
    }

    /**
     * Retorna o valor inteiro de um algarismo romano.
     *
     * @param caractere símbolo romano (I, V, X, L, C, D ou M)
     * @return valor inteiro correspondente ao símbolo.
     * @throws IllegalArgumentException se o símbolo não for válido.
     */
    private static int valorRomano(char caractere) {
        switch (caractere) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Algarismo romano inválido: " + caractere);
        }
    }

    /**
     * Método principal: processa a entrada e imprime o resultado.
     *
     * O programa aceita entrada de três maneiras:
     * 1. Argumento na linha de comando (java RomanoParaInt MCMXCIV)
     * 2. Digitação interativa via Scanner
     * 3. Entrada padrão (pipe ou redirecionamento)
     *
     * @param args argumentos passados na execução do programa
     */
    public static void main(String[] args) {
        // Entrada via argumento no terminal
        if (args.length > 0) {
            String algarismos = String.join("", args);
            int valor = AlgarismoRomanoParaInteiro(algarismos);
            System.out.println(valor);
            return;
        }

        // Caso não haja argumento, tenta ler da entrada padrão ou via Scanner.
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o algarismo: ");
        String algarismos = sc.nextLine();

        int valor = AlgarismoRomanoParaInteiro(algarismos);
        System.out.println(valor);

        sc.close();
    }
}
