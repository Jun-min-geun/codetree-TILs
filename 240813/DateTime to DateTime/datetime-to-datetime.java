import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = 11;
        int e = 11;
        int f = 11;

        int elapsedTime = 0;

        while(true) {
            if(d==a && e==b && f==c){
                break;
            }
            elapsedTime++;
            f++;

            if(f==60){
                e++;
                f=0;
            }
            if(e==24){
                d++;
                e=0;
            }
        }

        System.out.println(elapsedTime);

    }
}