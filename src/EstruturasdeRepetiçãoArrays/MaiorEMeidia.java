package EstruturasdeRepetiçãoArrays;

import java.util.Scanner;

public class MaiorEMeidia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;
        int contador = 0;
        do{
            System.out.println("NÚMERO:");
            numero = sc.nextInt();
            soma = soma + numero;
            if(numero > maior){
                maior = numero;
            }
            contador = contador +1;
        }while(contador < 5);
        System.out.println("O maior número digitado foi "+ maior);
        System.out.println("SOMA = "+ soma);
        System.out.println("MÉDIA = "+ soma/5);
        sc.close();
    }
}
