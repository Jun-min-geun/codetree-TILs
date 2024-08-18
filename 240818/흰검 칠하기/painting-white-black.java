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

            for(int k=0;k<x;k++){
                if(way.equals("R")){
                    if(array[now]==0){
                        array[now]=array[now]+1;
                    }else if(array[now]==21){
                        array[now]=array[now]+3;
                    } else if (array[now] == 10) {
                        array[now]=array[now]+2;
                    }else if(array[now]==42){
                        array[now]=array[now]+4;
                    }
                    now++;
                }
                else if(way.equals("L")){
                    if(array[now-1]==0){
                        array[now-1]=array[now-1]+10;
                    }else if(array[now-1]==1){
                        array[now-1]=array[now-1]+20;
                    }else if(array[now-1]==12){
                        array[now-1]=array[now-1]+30;
                    }else if(array[now-1]==24){
                        array[now-1]=array[now-1]+40;
                    }
                    now--;
                }
            }
        }
        int countwhite=0;
        int countblack=0;
        int countgray = 0;

        for(int j=0; j<10000; j++){
            if(array[j]==1 || array[j]==12 || array[j]==24){
                countblack++;
            }else if(array[j]==10 || array[j]==21|| array[j]==42){
                countwhite++;
            }else if(array[j]==46||array[j]==64){
                countgray++;
            }
        }

        System.out.println(countwhite+" "+countblack+" "+countgray);



    }
}