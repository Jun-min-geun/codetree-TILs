import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[1000000];
        int[] black = new int[1000000];
        int[] white = new int[1000000];
        int now = 500000;

        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            String way = sc.next();

                if(way.equals("R")){
                    for(int a=0;a<x;a++){
                        array[now]= 1;
                        black[now]++;
                        now++;
                    }
                    now--;
                }
                else if(way.equals("L")){
                    for(int b=0;b<x;b++){
                        array[now]=2;
                        white[now]++;
                        now--;
                    }
                    now++;
                }
        }
        int countwhite = 0;
        int countblack = 0;
        int countgray = 0;

        for(int j=0; j<1000000; j++){
            if(array[j]==1 && !(black[j]>=2&&white[j]>=2)){
                countblack++;
            }
            else if(array[j]==2 && !(black[j]>=2&&white[j]>=2)){
                countwhite++;
            }
            else if(black[j]>=2&&white[j]>=2){
                countgray++;
            }
        }

        System.out.println(countwhite+" "+countblack+" "+countgray);



    }
}