import java.util.*;

public class Main {
    public static final int MAX_NUM = 101;

    public static int n;
    public static int r1,c1,r2,c2;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM];

    public static Queue<Integer> queue = new LinkedList<>();


    private static boolean canGo(int x, int y) {
        return x >= 1 && x <= n && y >= 1 && y <= n;
    }

    public static void BFS() {
        while(!queue.isEmpty()){
            int x = queue.poll();
            int y = queue.poll();
//            System.out.println("x:"+x+" y:"+y);
            int[] dx = new int[]{-1, -2, 1, 2,-1,-2,1,2};
            int[] dy = new int[]{-2, -1, 2, 1,2,1,-2,-1};

            for(int dir = 0; dir < 8; dir++) {
                int newX = x + dx[dir];
                int newY = y + dy[dir];

                if(canGo(newX,newY)) {
                    if (!visited[newX][newY]) {
//                        System.out.println("dkdkdkkdk "+newX+" "+newY);
                        queue.add(newX);
                        queue.add(newY);
                        grid[newX][newY]=grid[x][y]+1;
                        visited[newX][newY]=true;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r1=sc.nextInt();;
        c1=sc.nextInt();;
        r2=sc.nextInt();;
        c2=sc.nextInt();


        queue.add(r1);
        queue.add(c1);

        BFS();

        if(grid[r2][c2]!=0){
            System.out.println(grid[r2][c2]);
        }else{
            System.out.println(-1);
        }
    }

}