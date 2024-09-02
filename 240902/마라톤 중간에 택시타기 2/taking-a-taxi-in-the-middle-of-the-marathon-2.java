import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 999999;

        int N = sc.nextInt();

        int[][] array = new int[N][2];

        for(int i=0; i<N; i++){
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        for(int a=1;a<N-1; a++){
            int distance = 0;
            for(int b=1; b<a; b++){
                distance += Math.abs(array[b-1][0]-array[b][0])+Math.abs(array[b-1][1]-array[b][1]);
            }
            for(int c=a+1;c<N-1;c++){
                distance += Math.abs(array[c][0]-array[c+1][0])+Math.abs(array[c][1]-array[c+1][1]);
            }
            distance += Math.abs(array[a-1][0]-array[a+1][0])+Math.abs(array[a-1][1]-array[a+1][1]);

            min = Math.min(min,distance);
        }


        System.out.println(min);

    }
}