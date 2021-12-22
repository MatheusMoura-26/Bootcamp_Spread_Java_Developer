package EstruturasdeRepetiçãoArrays;

import java.util.Random;

public class NumerosAleatoriosArrays {
    public static void main(String[] args) {
        Random random = new Random();
         int[] numerosAleatorios = new int[20];

         for (int i=0;i<numerosAleatorios.length-1;i++){
            int numero= random.nextInt(100);
            numerosAleatorios[i]=numero;
         }
        System.out.println("Numeros Aleatórios");
        for (int numero: numerosAleatorios ) {
            System.out.print(numero+" ");
        }
        System.out.println("Sucessores");
        for (int numero: numerosAleatorios            ) {
            System.out.print((numero+1) + " ");
        }

        System.out.println("Antessesores");
        for (int numero: numerosAleatorios            ) {
            System.out.print((numero-1) + " ");
        }
    }
}
