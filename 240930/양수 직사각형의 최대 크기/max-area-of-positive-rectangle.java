import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력:
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array= new int[n][m];
        int max = -1;
        for(int a=0; a<n;a++){
            for(int b=0;b<m;b++){
                array[a][b]=sc.nextInt();
            }
        }

        //사각형 정의
        for(int x1=0;x1<=n-1;x1++){
            for(int x2=x1;x2<=n-1;x2++){
                for(int y1=0;y1<=m-1;y1++){
                    for(int y2=y1;y2<=m-1;y2++){
                            max=Math.max(max,calculate(x1,x2,y1,y2,array));
                    }
                }
            }
        }


        System.out.println(max);
}

    private static int calculate(int x1, int x2, int y1, int y2, int[][] array) {

        if(right(x1,x2,y1,y2,array)){
            int sum=(x2-x1+1)*(y2-y1+1);
            return sum;
        }else{
            return -1;
        }
    }

    private static boolean right(int x1, int x2, int y1, int y2, int[][] array) {
        for(int i=x1;i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                if(array[i][j]<=0){
                    return false;
                }
            }
        }
        return true;
    }

}