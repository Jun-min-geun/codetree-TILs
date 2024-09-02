import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;

        int N = sc.nextInt();
        int[][] array = new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                array[i][j] = sc.nextInt();
            }
        }

        for(int a=0;a<N;a++){
            for(int b=0;b<=N-3;b++){
                max = Math.max(array[a][b]+array[a][b+1]+array[a][b+2],max);
            }

        }


        System.out.println(max);

    }
}