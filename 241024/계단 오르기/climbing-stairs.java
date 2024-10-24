import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 1000;
    public static final int UNUSED = -1;

    public static int n;
    public static int[] memo = new int[MAX_NUM + 1];

    public static void initializeMemo() {
        for(int i  = 0; i <= MAX_NUM; i++)
            memo[i] = UNUSED;
    }

    public static int fib(int n) {
        if(memo[n] != UNUSED)
            return memo[n];

        if(n==1)
            return memo[n]=0;

        if(n == 2 || n == 3)
            return memo[n] = 1;

        return memo[n] = fib(n - 2) + fib(n - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        initializeMemo();

        int way = fib(n);

        System.out.println(way&10007);
    }
}