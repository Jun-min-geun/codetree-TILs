import java.util.*;

public class Main {
    public static final int MAX_NUM = 100;

    public static int n,m;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM];

    public static Queue<Integer> queue = new LinkedList<>();

    public static boolean can;

    private static boolean canGo(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static void BFS() {
        while(!queue.isEmpty()){
            int x = queue.peek();
            int y = queue.peek();

            int[] dx = new int[]{0, 1, 0, -1};
            int[] dy = new int[]{1, 0, -1, 0};

            for(int dir = 0; dir < 4; dir++) {
                int newX = x + dx[dir];
                int newY = y + dy[dir];

                if(canGo(newX,newY)) {
                    if (!visited[newX][newY]) {
                        queue.add(newX);
                        queue.add(newY);
                        visited[newX][newY]=true;
                    }
                }
            }
            if(x==n-1 && y==m-1){
                can=true;
                break;
            }
            queue.remove();
            queue.remove();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m=sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        queue.add(0);
        queue.add(0);

        BFS();

        if(can){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}