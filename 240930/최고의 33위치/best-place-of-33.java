import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력:
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] array = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0;j<N;j++){
                array[i][j]=sc.nextInt();
            }
        }

        int max=Integer.MIN_VALUE;

        //시작점설정
        for(int a=0; a<=N-3; a++){
            for(int b=0; b<=N-3; b++){
                int count=0;

                //갯수파악
                for(int c=a;c<a+3;c++){
                    for(int d=b;d<b+3;d++){
                        if(array[c][d]==1){
                            count++;
                        }
                    }
                }

                max=Math.max(max,count);
            }
        }

        System.out.println(max);
}}