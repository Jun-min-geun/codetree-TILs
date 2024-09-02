import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        String A = sc.nextLine();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '(') {
                for (int j = i + 1; j < A.length(); j++) {
                    if (A.charAt(j) == ')') {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}