import java.util.*;

public class Main {
    public static final int MAX_NUM = 100;

    public static int n,k,num;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM];

    public static Queue<Integer> queue = new LinkedList<>();


    private static boolean canGo(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
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
                    if (!visited[newX][newY] && grid[newX][newY]==0) {
//                        System.out.println("dkdkdkkdk "+newX+" "+newY);
                        queue.add(newX);
                        queue.add(newY);
                        visited[newX][newY]=true;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k=sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        for(int a=0;a<k;a++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;

            queue.add(x);
            queue.add(y);
            visited[x][y]=true;

            BFS();

        }

        for(int b=0;b<n;b++){
            for(int c=0;c<n;c++){
                if(visited[b][c])
                    num++;
            }
        }
        System.out.println(num);
    }
}