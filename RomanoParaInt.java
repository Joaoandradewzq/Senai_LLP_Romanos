import java.util.Scanner;


public class RomanoParaInt {
          

    public static int AlgarismoRomanoParaInteiro(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
     
        s = s.trim().toUpperCase();

        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int atual = valorRomano(s.charAt(i));

       
            if (i + 1 < length) {
                int proximo = valorRomano(s.charAt(i + 1));
                if (atual < proximo) {
                    total -= atual;
                } else {
                    total += atual;
                }
            } else {
               
                total += atual;
            }
        }

        return total;
    }

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


    public static void main(String[] args) {
        if (args.length > 0) {
            String algarismos = String.join("", args);
            int valor = AlgarismoRomanoParaInteiro(algarismos);
            System.out.println(valor);
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o algarismo: ");
        String algarismos = sc.nextLine();

        int valor = AlgarismoRomanoParaInteiro(algarismos);
        System.out.println(valor);

        sc.close();
    }
}
