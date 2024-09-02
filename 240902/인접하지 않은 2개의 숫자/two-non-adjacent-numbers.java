import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        
        int n =sc.nextInt();
        int[] array = new int[n];
        
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        
        for(int a=0; a<n-2;a++){
            for(int b=a+2;b<n;b++){
                max = Math.max(max,array[a]+array[b]);
            }
        }
        
        System.out.println(max);
    }
}