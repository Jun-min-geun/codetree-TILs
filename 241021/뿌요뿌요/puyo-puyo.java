import java.util.*;

public class Main {
    public static final int DIR_NUM = 4;
    public static final int MAX_NUM = 100;

    public static int n;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM];
    public static int peopleNum, num;

    public static int maxNum = Integer.MIN_VALUE;


    private static boolean canGo(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static void DFS(int x, int y, int k) {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        for(int dir = 0; dir < 4; dir++) {
            int newX = x + dx[dir];
            int newY = y + dy[dir];

            if(canGo(newX,newY)) {
                if (grid[newX][newY] == k && !visited[newX][newY]) {
                    visited[newX][newY] = true;

                    peopleNum++;
                    DFS(newX, newY, k);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        for (int k = 0; k < MAX_NUM; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (k == grid[i][j]) {

                        visited[i][j] = true;
                        peopleNum = 1;

                        DFS(i, j, k);

                        if (peopleNum >= 4) {
                            num++;
                            maxNum = Math.max(maxNum, peopleNum);
                        }
                    }
                }
            }
        }

        System.out.println(num + " " + maxNum);

    }
}