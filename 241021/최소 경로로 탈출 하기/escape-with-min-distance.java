import java.util.*;

public class Main {
    public static final int MAX_NUM = 100;

    public static int n,m;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM];

    public static Queue<Integer> queue = new LinkedList<>();


    private static boolean canGo(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static void BFS() {
        while(!queue.isEmpty()){
            int x = queue.poll();
            int y = queue.poll();
//            System.out.println("x:"+x+" y:"+y);
            int[] dx = new int[]{0, 1, 0, -1};
            int[] dy = new int[]{1, 0, -1, 0};

            for(int dir = 0; dir < 4; dir++) {
                int newX = x + dx[dir];
                int newY = y + dy[dir];

                if(canGo(newX,newY)) {
                    if (!visited[newX][newY] && grid[newX][newY]!=0) {
//                        System.out.println("dkdkdkkdk "+newX+" "+newY);
                        queue.add(newX);
                        queue.add(newY);
                        visited[newX][newY]=true;
                        grid[newX][newY]=grid[x][y]+1;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        visited[0][0]=true;

        queue.add(0);
        queue.add(0);

        BFS();

        if(grid[n-1][m-1]==1){
            System.out.println(-1);
        }else{
            System.out.println(grid[n-1][m-1]-1);
        }
    }

}