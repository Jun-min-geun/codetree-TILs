import java.util.*;

public class Main {
    public static final int DIR_NUM = 4;
    public static final int MAX_N = 100;
    
    public static int n, m, r, c;
    public static int[][] grid = new int[MAX_N][MAX_N];
    public static int[][] nextGrid = new int[MAX_N][MAX_N];
    
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    
    public static void expand(int x, int y, int dist) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i] * dist, ny = y + dy[i] * dist;
            if(inRange(nx, ny))
                nextGrid[nx][ny] = 1;
        }
    }
    
    public static void simulate(int dist) {
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                nextGrid[i][j] = 0;

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(grid[i][j] > 0)
                    expand(i, j, dist);

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(nextGrid[i][j] > 0)
                    grid[i][j] = 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();
        
        grid[r - 1][c - 1] = 1;
        
        int dist = 1;
        while(m-- > 0) {
            simulate(dist);
            dist *= 2;
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                ans += grid[i][j];
        
        System.out.print(ans);
    }
}