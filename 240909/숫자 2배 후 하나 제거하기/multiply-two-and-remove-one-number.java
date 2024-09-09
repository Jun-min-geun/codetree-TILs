import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        int n= sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }

        for(int a=0;a<n;a++){
            array[a]=array[a]*2;

            for(int b=0;b<n;b++){
                int[] remind = new int[n-1];
                int count = 0;

                for(int c=0; c<n;c++){
                    if(c!=b){
                        remind[count++] = array[c];
                    }
                }
                int diff = 0;
                for(int d=0;d < n-2;d++){
                    diff+=Math.abs(remind[d+1]-remind[d]);
                }
                min = Math.min(min,diff);
            }
            
            array[a] /=2;
        }


        System.out.println(min);

    }
}