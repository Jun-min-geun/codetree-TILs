import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 1;

        int[] numbers = new int[n+1];

        for(int i = 0; i<n; i++){
            numbers[i]=sc.nextInt();
        }

        int count = 1;
        for(int i = 0; i<n+1; i++){
            if(i==0){
                count=1;
            }else if(numbers[i]==numbers[i-1]){
                count++;
            }else if(numbers[i]!=numbers[i-1]){
                if(count>max){
                    max=count;
                }
                count=1;
            }
//            for(int a = i; a<n; a++) {
//                if (numbers[i] == numbers[a]) {
//                    j++;
//                }else{
//                    break;
//                }
//                if (count < j) {
//                    count = j;
//                }
//            }
        }

        System.out.println(max);


    }
}