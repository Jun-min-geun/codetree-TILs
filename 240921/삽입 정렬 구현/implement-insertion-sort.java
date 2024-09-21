import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }

        for(int a=1; a<n; a++){
            int num = a-1;
            int key = array[a];
            while(num>=0 && array[num]>key){
                array[num+1]=array[num];
                num--;
            }
            array[num+1]=key;
        }

        for(int j=0;j<n;j++){
            System.out.print(array[j]+" ");
        }

    }
}