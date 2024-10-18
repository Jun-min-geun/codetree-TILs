import java.util.*;

public class Main {
    public static final int MAX_NUM = 100;
    public static int n, m;

    public static int[][] graph = new int[MAX_NUM + 1][MAX_NUM + 1];

    public static boolean isCertain = false;

    public static void DFS(int startX, int startY) {
        if(startX==n && startY==m){
            isCertain=true;
        }
        if(graph[startX+1][startY]==1){
            DFS(startX+1,startY);
        }
        if(graph[startX][startY+1]==1){
            DFS(startX,startY+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m;j++){
                graph[i][j]=sc.nextInt();
            }
        }

        DFS(1,1);

        if(isCertain){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}