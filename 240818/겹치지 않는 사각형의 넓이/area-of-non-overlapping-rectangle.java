import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int [][] array = new int[2001][2001];

        for(int a=0; a<2; a++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int i=x1+1000;i<x2+1000;i++){
                for(int j=y1+1000; j<y2+1000;j++){
                    array[i][j]=1;
                }
            }
        }

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        for(int i=x1+1000;i<x2+1000;i++){
            for(int j=y1+1000; j<y2+1000;j++){
                array[i][j]=3;
            }
        }

        for(int b=0; b<2001; b++){
            for(int c=0; c<2001; c++){
                if(array[b][c]==1){
                    count++;
                }
            }
        }

        System.out.println(count);


    }
}