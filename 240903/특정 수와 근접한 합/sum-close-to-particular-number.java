import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] array = new int[N];
        int mindiff = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        for (int a = 0; a < N - 1; a++) {
            for (int b = a + 1; b < N; b++) {
                int sum = 0;
                for (int c = 0; c < N; c++) {
                    if (c != a && c != b) {
                        sum += array[c];
                    }
                }
                mindiff = Math.min(Math.abs(S - sum), mindiff);
            }
        }

        System.out.println(mindiff);
    }
}