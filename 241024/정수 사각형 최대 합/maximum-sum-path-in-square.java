import java.util.Scanner;

public class Main {
    public static int Max_Num=100;
    public static int n;

    public static int[][] graph = new int[Max_Num+1][Max_Num+1];
    public static int[][] dp = new int[Max_Num+1][Max_Num+1];

    public static void initialize(){
        dp[1][1]=graph[1][1];

        for(int i=2;i<=n;i++){
            dp[1][i]=dp[1][i-1]+graph[1][i];
        }
        for(int j=2;j<=n;j++){
            dp[j][1]=dp[j-1][1]+graph[j][1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                graph[i][j]=sc.nextInt();
            }
        }

        initialize();

        for(int a=2;a<=n;a++){
            for(int b=2;b<=n;b++){
                dp[a][b]=Math.max(dp[a][b-1]+graph[a][b],dp[a-1][b]+graph[a][b]);
            }
        }


        System.out.println(dp[n][n]);
    }
}