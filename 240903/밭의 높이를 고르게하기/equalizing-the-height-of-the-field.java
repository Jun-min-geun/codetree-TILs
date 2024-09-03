import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt();
        int T = sc.nextInt();
        int[] array = new int[N];
        int min=999999;

        for(int i=0; i<N; i++){
           array[i]=sc.nextInt();
        }

        for(int j=0;j<N;j++){
            array[j]=Math.abs(array[j]-H);
        }

        for(int a=0; a<=N-T; a++){
            int sum=0;
            for(int b=a; b<a+T;b++){
                sum+=array[b];
            }
            min=Math.min(min,sum);
        }

        System.out.println(min);

        }
    }