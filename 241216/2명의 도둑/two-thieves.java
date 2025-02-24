import java.util.Scanner;

public class Main {
    public static final int MAX_M = 5;
    public static final int MAX_N = 10;
    
    public static int n, m, c;
    public static int[][] weight = new int[MAX_N][MAX_N];
    
    public static int[] a = new int[MAX_M];
    
    public static int ans;
    public static int maxVal;
    
    public static void findMaxSum(int currIdx, int currWeight, int currVal) {
        if(currIdx == m) {
            if(currWeight <= c)
                maxVal = Math.max(maxVal, currVal);
            return;
        }
    
        findMaxSum(currIdx + 1, currWeight, currVal);
        
        findMaxSum(currIdx + 1, currWeight + a[currIdx], 
                   currVal + a[currIdx] * a[currIdx]);
    }
    
    public static int findMax(int sx, int sy) {
        for(int i = sy; i <= sy + m - 1; i++)
            a[i - sy] = weight[sx][i];

        maxVal = 0;
        findMaxSum(0, 0, 0);
        return maxVal;
    }
    
    public static boolean intersect(int a, int b, int c, int d) {
        return ! (b < c || d < a); 
    }
    
    public static boolean possible(int sx1, int sy1, int sx2, int sy2) {

        if(sy1 + m - 1 >= n || sy2 + m - 1 >= n) 
            return false;                        
        
        if(sx1 != sx2)                          
            return true;                        
        
        if(intersect(sy1, sy1 + m - 1, sy2, sy2 + m - 1)) 
            return false;                               
        
        return true;                             
    }                                           

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        c = sc.nextInt();
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++) 
                weight[i][j] = sc.nextInt();

        for(int sx1 = 0; sx1 < n; sx1++)
            for(int sy1 = 0; sy1 < n; sy1++)
                for(int sx2 = 0; sx2 < n; sx2++)
                    for(int sy2 = 0; sy2 < n; sy2++) {
                        if(possible(sx1, sy1, sx2, sy2))
                            ans = Math.max(ans, findMax(sx1, sy1) 
                                         + findMax(sx2, sy2));
                    }
        
        System.out.print(ans);
    }
}