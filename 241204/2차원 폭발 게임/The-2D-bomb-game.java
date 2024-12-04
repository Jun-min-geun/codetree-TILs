import java.util.Scanner;

public class Main {
    public static final int WILL_EXPLODE = 0;
    public static final int BLANK = -1;
    public static final int MAX_NUM = 100;
    
    public static int n, m, k, endOfNumbers_1d, endOfTemp_1d;
    public static int[][] numbers_2d = new int[MAX_NUM][MAX_NUM];
    public static int[] numbers_1d = new int[MAX_NUM];
    public static int[][] temp_2d = new int[MAX_NUM][MAX_NUM];
    public static int[] temp_1d = new int[MAX_NUM];
    
    public static int getEndIdxOfExplosion(int startIdx, int currNum) {
        int endIdx = startIdx + 1;
        while(endIdx < endOfNumbers_1d) {
            if(numbers_1d[endIdx] == currNum)
                endIdx++;
            else{
                break;
            }
        }
    
        return endIdx - 1;
    }

    public static void fillZero(int startIdx, int endIdx) {
        for(int i = startIdx; i <= endIdx; i++) {
            numbers_1d[i] = WILL_EXPLODE;
        }
    }
    
    public static void moveToTemp() {
        endOfTemp_1d = 0;
        for(int i = 0; i < endOfNumbers_1d; i++) {
            if(numbers_1d[i] != WILL_EXPLODE) {
                temp_1d[endOfTemp_1d++] = numbers_1d[i];
            }
        }
    }
    
    public static void copyFromTemp() {
        endOfNumbers_1d = endOfTemp_1d;
        for(int i = 0; i < endOfNumbers_1d; i++) {
            numbers_1d[i] = temp_1d[i];
        }
    }
    
    public static void explode() {
    
        boolean didExplode;
        do {
            didExplode = false;
            for(int currIdx = 0; currIdx < endOfNumbers_1d; currIdx++) {  

                if(numbers_1d[currIdx] == WILL_EXPLODE) { 
                    continue;
                }

                int endIdx = getEndIdxOfExplosion(currIdx, numbers_1d[currIdx]);
    
                if(endIdx - currIdx + 1 >=  m) {
                    fillZero(currIdx, endIdx);
                    didExplode = true;
                }
            }
    
            moveToTemp();
            copyFromTemp();       
        }
        while(didExplode); 
    
    }
    
    public static void copyColumn(int col){
        endOfNumbers_1d = 0;
        for(int i = 0; i < n; i++)
            if(numbers_2d[i][col] != BLANK)
                numbers_1d[endOfNumbers_1d++] = numbers_2d[i][col];
    
        return;
    }
    
    public static void copyResult(int col){
        int resultIdx = endOfNumbers_1d - 1;
        for(int i = n - 1; i >= 0; i--) {
            if(resultIdx >= 0)
                numbers_2d[i][col] = numbers_1d[resultIdx--];
            else
                numbers_2d[i][col] = BLANK;
        }
    }
    
    public static void simulate() {
        for(int col = 0; col < n; col++) {
            copyColumn(col);
            explode();
            copyResult(col);
        }
    }
    
    public static void rotate() {
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                temp_2d[i][j] = BLANK;
    

        int currIdx;
        for(int i = n - 1; i >= 0; i--) {
            currIdx = n - 1;
            for(int j = n - 1; j >= 0; j--) {
                if(numbers_2d[i][j] != BLANK)
                    temp_2d[currIdx--][n - i - 1] = numbers_2d[i][j];
            }
        }
    
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                numbers_2d[i][j] = temp_2d[i][j];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                numbers_2d[i][j] = sc.nextInt();

        simulate();
        for(int i = 0; i < k; i++) {
            rotate();
            simulate();
        }

        int answer = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(numbers_2d[i][j] != BLANK)
                    answer++;
        
        System.out.print(answer);
    }
}