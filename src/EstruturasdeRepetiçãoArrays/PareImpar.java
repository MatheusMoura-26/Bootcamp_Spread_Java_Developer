package EstruturasdeRepetiçãoArrays;

import java.util.Scanner;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class PareImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantPar,quantImpar, quant, numero, count;

        System.out.println("Digite a quantidade de números:");
        quant = sc.nextInt();
        count = 0;
        quantImpar =0;
        quantPar=0;
                do{
                    System.out.println("Digite um número:");
                    numero =sc.nextInt();
                    if(numero % 2 ==0){
                        quantPar = quantPar + 1;
                     }else{
                        quantImpar = quantImpar +1;
                    }
                    count++;
                }while (count < quant);
        System.out.println("A quantidade de numeros ímpares digitados foi "+ quantImpar);
        System.out.println("A quantidade de numeros pares  digitados foi "+ quantPar);

    }
}
