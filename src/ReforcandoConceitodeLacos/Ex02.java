package ReforcandoConceitodeLacos;

public class Ex02 {
    public static void main(String[] args) {
        //for de 1 a 14 so exibindo multiplos de 2 e interropendo no 12
        for (int i = 1;i<=14; i++){
            if (i%2==0){
                System.out.print(i+ "  ");
            }
            if (i==12){
                break;
            }
        }
    //Quebrando um while
        while (true){
            System.out.println("Quase nada aé infinito");
            break;
        }



    }
}
