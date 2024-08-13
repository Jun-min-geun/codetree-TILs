import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int elapsedTime = 1;

        while(true) {
            if(a==c && b==d){
                break;
            }
            elapsedTime++;
            b++;

            if(b>num_of_days[a]){
                a++;
                b=1;
            }
        }

        System.out.println(elapsedTime);

    }
}