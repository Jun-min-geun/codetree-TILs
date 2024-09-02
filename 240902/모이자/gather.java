import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minsum = 9999;

        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            int middle = 0;

            for(int j=0;j<n;j++){
                middle += array[j]*(Math.abs(j-i));
            }

            minsum= Math.min(minsum,middle);
        }

        System.out.println(minsum);

    }
}