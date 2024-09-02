import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        int N = sc.nextInt();
        int[] array = new int[N];
        
        for(int i=0;i<N;i++){
            array[i]=sc.nextInt();
        }
        
        for(int a=0;a<N;a++){
            for(int b=a+1;b<N;b++){
                for(int c=b+1; c<N; c++){
                    if(array[a]<=array[b] && array[b]<=array[c]){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}