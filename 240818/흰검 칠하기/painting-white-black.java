import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[10000];
        int now = 5000;

        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            String way = sc.next();

                if(way.equals("R")){
                    for(int a=0;a<x;a++){
                        if(array[now]==0){
                            array[now]=1;
                        }else if(array[now]==2){
                            array[now]=4;
                        } else if (array[now]==3) {
                            array[now]=5;
                        }else if(array[now]==6){
                            array[now]=8;
                        }
                        now++;
                    }
                }
                else if(way.equals("L")){
                    for(int b=0;b<x;b++){
                        if(array[now-1]==0){
                            array[now-1]=2;
                        }else if(array[now-1]==1){
                            array[now-1]=3;
                        }else if(array[now-1]==4){
                            array[now-1]=6;
                        }else if(array[now-1]==5){
                            array[now-1]=7;
                        }
                        now--;
                    }
                }
        }
        int countwhite=0;
        int countblack=0;
        int countgray = 0;

        for(int j=0; j<10000; j++){
            if(array[j]==1 || array[j]==4 || array[j]==5){
                countblack++;
            }else if(array[j]==2 || array[j]==3|| array[j]==6){
                countwhite++;
            }else if(array[j]==7||array[j]==8){
                countgray++;
            }
        }

        System.out.println(countwhite+" "+countblack+" "+countgray);



    }
}