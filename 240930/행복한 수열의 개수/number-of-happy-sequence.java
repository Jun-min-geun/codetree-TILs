import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력:
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0;j<N;j++){
                array[i][j]=sc.nextInt();
            }
        }

        int countnum =0;

        //시작점설정
        for(int a=0; a<N; a++){
            int count=1;
            for(int b=0; b<N; b++){
                if(b!=0 && array[a][b]==array[a][b-1]){
                    count++;
                }else{
                    count=1;
                }
                if(count==m){
                    countnum++;
                    break;
                }
            }
        }

        for(int c=0; c<N; c++){
            int count=1;
            for(int d=0; d<N; d++){
                if(d!=0 && array[d][c]==array[d-1][c]){
                    count++;
                }else{
                    count=1;
                }
                if(count==m){
                    countnum++;
                    break;
                }
            }
        }

        System.out.println(countnum);
}}