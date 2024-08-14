import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] path = new int[10000];
        int now = 5000;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String direction = sc.next();

            if (direction.equals("R")) {
                for (int j = 0; j < x; j++) {
                    path[now]++;
                    now++;
                }
            } else if (direction.equals("L")) {
                for (int j = 0; j < x; j++) {
                    path[now]++;
                    now--;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < path.length; i++) {
            if (path[i] >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}