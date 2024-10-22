import java.util.Scanner;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Pair {
    int x, y;
    public Pair(int x, int y) { 
        this.x = x; 
        this.y = y; 
    }
}

public class Main {
    public static final int DIR_NUM = 4;
    public static final int MAX_N = 100;
    
    public static int n, h, m;
    
    public static int[][] a = new int[MAX_N][MAX_N];

    public static ArrayList<Pair> sPos = new ArrayList<>();

    public static Queue<Pair> q = new LinkedList<>();
    public static boolean[][] visited = new boolean[MAX_N][MAX_N];
    public static int[][] step = new int[MAX_N][MAX_N]; 

    
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    
    public static boolean canGo(int x, int y) {
        return inRange(x, y) && a[x][y] != 1 && !visited[x][y];
    }

    public static void push(int nx, int ny, int newStep) {
        q.add(new Pair(nx, ny));
        visited[nx][ny] = true;
        step[nx][ny] = newStep;
    }
    
    public static void BFS() {
        while(!q.isEmpty()) {
            Pair currPos = q.poll();
            int x = currPos.x, y = currPos.y;
    
            int[] dx = new int[]{-1, 1, 0, 0};
            int[] dy = new int[]{0, 0, -1, 1};
    
            for(int dir = 0; dir < DIR_NUM; dir++) {
                int nx = x + dx[dir], ny = y + dy[dir];

                if(canGo(nx, ny))
                    push(nx, ny, step[x][y] + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        h = sc.nextInt();
        m = sc.nextInt();
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if(a[i][j] == 3)
                    sPos.add(new Pair(i, j));
            }
        
        for(int i = 0; i < (int) sPos.size(); i++)
            push(sPos.get(i).x, sPos.get(i).y, 0);
        
        BFS();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(a[i][j] != 2)
                    System.out.print(0 + " ");
                else {
                    if(!visited[i][j])
                        System.out.print(-1 + " ");
                    else
                        System.out.print(step[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}