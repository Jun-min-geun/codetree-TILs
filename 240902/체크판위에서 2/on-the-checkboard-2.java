import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] array = new int[R][C];

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(sc.next().equals("W")){
                    array[i][j] = 0;
                }else{
                    array[i][j] = 1;
                }
            }
        }

        for(int a = 1; a < R; a++){
            for(int b = 1; b < C; b++){
                for(int c = a + 1; c < R-1; c++){
                    for(int d = b + 1; d < C-1; d++){
                                if(array[0][0] != array[a][b] && array[a][b] != array[c][d] && array[c][d] != array[R-1][C-1]){
                                    num++;
                        }
                    }
                }
            }
        }


        System.out.println(num);

    }
}