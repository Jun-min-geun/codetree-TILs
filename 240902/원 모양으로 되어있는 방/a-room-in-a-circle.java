import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 999999999;

        int N = sc.nextInt();
        int[] array = new int[N];

        for(int i=0; i<N; i++){
            array[i] = sc.nextInt();
        }

        for(int a=0; a<N; a++){
            int distance= 0;
            for(int b=a+1;b<N;b++){
                distance+=array[b]*(b-a);
            }
            for(int c=0; c<a; c++){
                distance += array[c]*(N-a+c);
            }

            min = Math.min(min,distance);
        }



        System.out.println(min);

    }
}