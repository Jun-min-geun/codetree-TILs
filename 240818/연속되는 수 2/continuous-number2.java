import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int count = 0;

        while(true){
             n = sc.nextInt();
            if(n<1 && n>1000){
                System.out.println("다시 입력하세요.");
                continue;
            }else{
                break;
            }
        }

        Integer[] numbers = new Integer[n];

        for(int i = 0; i<n; i++){
            int j = sc.nextInt();
            if(0<=j&& j<=1000){
                numbers[i] = j;
            }else{
                System.out.println("똑바로 입력하레이");
                i--;
            }
        }

        for(int i = 0; i<n; i++){
            int j = 0;
            for(int a = i; a<n; a++) {
                if (numbers[i] == numbers[a]) {
                    j++;
                }else{
                    break;
                }
                if (count < j) {
                    count = j;
                }
            }
        }

        System.out.println(count);


    }
}