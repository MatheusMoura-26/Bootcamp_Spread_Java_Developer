package EstruturasdeRepetiçãoArrays;

import java.util.Scanner;

public class ConsoantesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantCosoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra:");
            String letra = sc.next();
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quantCosoantes++;
            }
            count++;
        }while (count < consoantes.length);

        System.out.println("Consoantes");
        for (String consoante: consoantes ) {
            if (consoante != null)
            System.out.print(consoante+ " ");
        }
        System.out.println("Quantidade de consoantes digitadas: "+quantCosoantes);
    }
}
