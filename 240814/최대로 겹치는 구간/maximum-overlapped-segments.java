import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[201];

        for(int i=0;i<n;i++){
            int x1= sc.nextInt();
            int x2= sc.nextInt();

            for(int j=x1+100;j<x2+100;j++){
                array[j]++;
            }
        }
        int max=0;
        for(int i=0; i<201; i++){
            if(array[i]>max){
                max=array[i];
            }
        }

        System.out.println(max);

    }
}