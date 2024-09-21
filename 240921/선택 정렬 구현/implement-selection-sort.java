import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }

        for(int a=0;a<n-1;a++){
            int min = a;
            for(int b=a;b<n;b++){
                if(array[b]<array[min]){
                    min=b;
                }
            }
            int tmp = array[a];
            array[a]=array[min];
            array[min]=tmp;

        }

        for(int j=0;j<n;j++){
            System.out.print(array[j]+" ");
        }

    }
}