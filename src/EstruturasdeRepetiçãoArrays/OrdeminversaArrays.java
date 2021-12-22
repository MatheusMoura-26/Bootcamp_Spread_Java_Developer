package EstruturasdeRepetiçãoArrays;

public class OrdeminversaArrays {
    public static void main(String[] args) {
        int[] vetor = {6,8,81,32,23,26};

        //Importante entender que o vetor sempre começará em 0
       // System.out.println(vetor.length);

        int count = 0;
        while(count < (vetor.length)){
            System.out.println(vetor[count]+ ", ");
            count++;
        }

        System.out.println("====================================");

        for (int i=(vetor.length-1);i>=0;i--){
            System.out.println(vetor[i]+ ", ");
        }
    }
}
