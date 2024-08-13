import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] array = new int[N+1];


        for(int i=0;i<K; i++){
            int a1= sc.nextInt();
            int b1= sc.nextInt();

            for(int j=a1;j<b1+1;j++){
                array[j]++;
            }
        }

        int max = 0;
        for(int i=0;i<N; i++){
            if(array[i]>max){
                max=array[i];
            }
        }

        System.out.println(max);


    }
}