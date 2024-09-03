import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        int max=0;

        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }

        for(int i=0; i<n-k; i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum += array[j];
                max=Math.max(max,sum);
            }
        }

        System.out.println(max);

        }
    }