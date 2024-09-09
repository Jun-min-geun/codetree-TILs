import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        int A= sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        for(int i=0; i<=1000/A;i++){
            for(int j=0;j<=1000/B;j++){
                int sum=0;
                sum = A*i+B*j;
                
                if(sum<=C){
                    max=Math.max(max,sum);
                }
            }
        }

       


        System.out.println(max);

    }
}