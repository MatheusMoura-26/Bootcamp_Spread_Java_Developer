package EstruturasdeRepetiçãoArrays;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count,  numero;

        System.out.println("Digite o número para vê a tabuada:");
        numero = sc.nextInt();
                for(int i = 1;i<=10 ;i++){
                    System.out.println(numero +" X " + i +" = "+numero*i);
                }
                sc.close();
    }
}
