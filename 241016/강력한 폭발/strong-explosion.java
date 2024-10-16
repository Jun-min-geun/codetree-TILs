import java.util.*;

public class Main {
    public static int n,max;
    public static int count;
    public static int[][] array;
    public static int[][] locate;
    public static int[][] bomb1 = {{-2,0},{-1,0},{1,0},{2,0}};
    public static int[][] bomb2 = {{0,-1},{0,1},{1,0},{-1,0}};
    public static int[][] bomb3 = {{-1,-1},{-1,1},{1,1},{1,-1}};

    // 출력
    public static void checkMax() {
        int number = 0;
        for(int i=2; i<n+2;i++){
            for(int j=2;j<n+2;j++){
                if(array[i][j]!=0){
                    number++;
                }
            }
            System.out.println();
        }

        max = Math.max(number,max);
    }

    public static void goBomb(int bombNum, int x, int y){
        if(bombNum==1){
            for(int i=0;i<4;i++){
                if(array[x+bomb1[i][0]][y+bomb1[i][1]]==0)
                    array[x+bomb1[i][0]][y+bomb1[i][1]]=2;
            }
        }else if(bombNum==2){
            for(int i=0;i<4;i++){
                if(array[x+bomb2[i][0]][y+bomb2[i][1]]==0)
                    array[x+bomb2[i][0]][y+bomb2[i][1]]=3;
            }
        }else{
            for(int i=0;i<4;i++){
                if(array[x+bomb3[i][0]][y+bomb3[i][1]]==0)
                    array[x+bomb3[i][0]][y+bomb3[i][1]]=4;
            }
        }
    }

    public static void deleteBomb(int bombNum, int x, int y){
        if(bombNum==1){
            for(int i=0;i<4;i++){
                if(array[x+bomb1[i][0]][y+bomb1[i][1]]==2)
                    array[x+bomb1[i][0]][y+bomb1[i][1]]=0;
            }
        }else if(bombNum==2){
            for(int i=0;i<4;i++){
                if(array[x+bomb2[i][0]][y+bomb2[i][1]]==3)
                    array[x+bomb2[i][0]][y+bomb2[i][1]]=0;
            }
        }else{
            for(int i=0;i<4;i++){
                if(array[x+bomb3[i][0]][y+bomb3[i][1]]==4)
                    array[x+bomb3[i][0]][y+bomb3[i][1]]=0;
            }
        }
    }

    public static void findPermutations(int cnt) {
        // n개 뽑
        if(cnt == count+1) {
            checkMax();
            return;
        }
        //위치 찾기
        int i = locate[cnt][0];
        int j = locate[cnt][1];

            for(int k=1;k<=3;k++){
                goBomb(k,i,j);
                findPermutations(cnt+1);
                deleteBomb(k,i,j);
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        max = Integer.MIN_VALUE;
        array = new int[n+4][n+4];
        locate = new int[n+1][2];
        count = 0;

        for(int i=2; i<n+2; i++){
            for(int j=2;j<n+2;j++){
                array[i][j]=sc.nextInt();
                if(array[i][j]==1){
                    locate[count+1][0]=i;
                    locate[count+1][1]=j;
                    count++;

                }
            }
        }

        findPermutations(1);

        System.out.println(max);
    }
}