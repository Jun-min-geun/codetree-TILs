import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        int [][] array = new int[200][200];

        for(int i=0; i<N; i++){
            int x1= sc.nextInt();
            int y1= sc.nextInt();
            int x2= sc.nextInt();
            int y2= sc.nextInt();

            for(int j=x1+100;j<x2+100;j++){
                for(int k=y1+100; k<y2+100; k++){
                    array[j][k]=1;
                }
            }
        }

        for(int a=0; a<200; a++){
            for(int b=0; b<200;b++){
                if(array[a][b]==1){
                    count++;
                }
            }
        }

        System.out.println(count);


    }
}