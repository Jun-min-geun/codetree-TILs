import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }

        for(int b=0; b<n;b++){
        for( int a=0; a<n-1; a++){
            if(array[a]>array[a+1]){
                int temp = array[a];
                array[a]=array[a+1];
                array[a+1]=temp;
            }
        }
        }

        for(int j=0;j<n;j++){
            System.out.print(array[j]+" ");
        }

    }
}