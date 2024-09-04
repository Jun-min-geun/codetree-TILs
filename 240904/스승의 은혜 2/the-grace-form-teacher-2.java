import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        int[] P = new int[N];
        int max = 0;

        for(int i=0; i<N; i++){
            P[i]=sc.nextInt();
        }

        for(int a=0; a<N; a++){
            int[] array= new int[N];
            int count = 0;
            int value = 0;
            for(int b=0; b<N; b++){
                if(b==a){
                    array[b]=P[b]/2;
                }else{
                    array[b]=P[b];
                }

            }

            Arrays.sort(array);
            for(int q=0;q<N;q++){
                System.out.print(array[q]+" ");
            }
            System.out.println();

            for(int c=0;c<N; c++){
                if(value+array[c]<=B){
                    value+=array[c];
                    count++;
                }else if(value+array[c]<=B && c==N-1){
                    max=Math.max(max,count+1);
                    break;
                }else{
                    max=Math.max(max,count);
                    break;
                }
            }
        }


        System.out.println(max);

    }
}