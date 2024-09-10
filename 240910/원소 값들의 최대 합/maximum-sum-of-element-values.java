import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        for(int a=0;a<n;a++){
            int now = a;
            int sum = 0;
            
            for(int b=0;b<m;b++){
                sum+=array[now];
                now=array[now]-1;
            }
            
            max=Math.max(max,sum);
        }

        System.out.println(max);
        }
    }