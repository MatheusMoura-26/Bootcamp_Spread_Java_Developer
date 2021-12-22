package ReforcandoConceitodeLacos;

public class Ex01 {
    public static void main(String[] args) {

        //Crescente
        System.out.println("Contando de 0 a 9");
        for (int i =0;i<10; i++){
            System.out.print(i+"  ");
        }

        //Decrecente
        System.out.println("Contandos de 9 até 0");
        for (int i = 9;i>=0;i--){
            System.out.print(i+ "  ");
        }
        System.out.println("");


        // de 3 até 11
        System.out.println("De 3 até 11");
        for (int i = 3;i<=11;i=i+2){
            if (i<=7){
                System.out.print(i+ "  ");
            }
        }
        System.out.println("");

        //apenas com o contador
        System.out.println("Exibindo o texto");
        int vez = 1;
        while (vez <6){
            System.out.println("Exibindo o texto pela "+ vez + "º vez");
            vez++;
        }

        //Utilizando o booleano
        System.out.println("Exibindo o texto com o boolean");
        vez = 1;
        boolean continuar = true;
        while (continuar){
            System.out.println("Exibindo o texto pela "+ vez + "º vez");
            vez++;
            if (vez >5){
                continuar = false;
            }
        }

    }
}
