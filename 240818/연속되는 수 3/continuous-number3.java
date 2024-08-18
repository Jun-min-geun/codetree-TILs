import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 1;

        int[] numbers = new int[n];

        for(int i = 0; i<n; i++){
            numbers[i]=sc.nextInt();
        }

        int count = 1;

        for(int i = 0; i<n; i++){
            if(numbers[i]>0){
                numbers[i]=2;
            }else{
                numbers[i]=1;
            }
        }

        for(int j=1; j<n; j++){
            if(numbers[j]==numbers[j-1]){
                count++;
            }else{
                if(count>max){
                    max=count;
                }
                count=1;
            }
        }

        System.out.println(max);


    }
}