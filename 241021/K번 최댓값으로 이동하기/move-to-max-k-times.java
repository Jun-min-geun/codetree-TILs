import java.util.*;

public class Main {
    public static final int MAX_NUM = 100;

    public static int n,k,startX,startY;
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
                    if (!visited[newX][newY] && grid[newX][newY]<grid[startX][startY]) {
//                        System.out.println("dkdkdkkdk "+newX+" "+newY);
                        queue.add(newX);
                        queue.add(newY);
                        visited[newX][newY]=true;
                    }
                }
            }

        }
    }
    private static int[] nextStart(int StartX, int StartY) {
        int nextX=-1;int nextY=-1;
        int max = -1;
        for(int b=n-1;b>=0;b--){
            for(int c=n-1;c>=0;c--){
                if(visited[b][c]){
                    max=Math.max(max,grid[b][c]);
                }
            }
        }
        if(max==-1){
            return new int[]{StartX,StartY};
        }
        for(int i=n-1; i>=0; i--){
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==max){
//                    System.out.println("max: "+ max);
                    nextX=i;
                    nextY=j;
                }
            }
        }
        return new int[]{nextX, nextY};

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        startX=sc.nextInt()-1;
        startY=sc.nextInt()-1;

        for(int a=0;a<k;a++){
//            System.out.println("시작점"+startX+" "+startY);
            if(startX==-1){
                break;
            }
            queue.add(startX);
            queue.add(startY);

            BFS();

            for(int q=0;q<n;q++){
                for(int p=0;p<n;p++){
//                    System.out.print(visited[q][p]+" ");
                }
//                System.out.println();
            }

            int[] nexts = nextStart(startX,startY);

            startX=nexts[0];startY=nexts[1];
            visited= new boolean[MAX_NUM][MAX_NUM];

        }

        System.out.println((startX+1)+" "+(startY+1));
    }

}