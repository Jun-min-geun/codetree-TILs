import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력:
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                array[i][j]=sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;

        //조건1 ㄴ
        for(int a=0; a<=n-2; a++){
            for(int b=0; b<=m-2; b++){
                int min = Math.min(
                        Math.min(array[a][b], array[a+1][b]),
                        Math.min(array[a][b+1], array[a+1][b+1])
                );
                int sum = array[a][b]+array[a+1][b]+array[a][b+1]+array[a+1][b+1];
                max=Math.max(max,sum-min);
            }
        }

        //조간2 ㅡ
        for(int c=0;c<=n-1; c++){
            for(int d=0; d<=m-3;d++){
                int sum=array[c][d]+array[c][d+1]+array[c][d+2];
                max=Math.max(sum,max);
            }
        }

        //조건3 ㅣ
        for(int e=0;e<=n-3;e++){
            for(int f=0; f<=m-1;f++){
                max=Math.max(max,array[e][f]+array[e+1][f]+array[e+2][f]);
            }
        }

        System.out.println(max);

}}