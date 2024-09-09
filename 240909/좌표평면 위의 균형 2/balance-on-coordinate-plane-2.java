import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        int N = sc.nextInt();
        int[][] locate = new int[N][2];

        for(int i=0; i<N; i++){
            locate[i][0]=sc.nextInt();
            locate[i][1]=sc.nextInt();
        }

        for(int a=0;a<=100;a=a+2){
            for(int b=0;b<=100;b=b+2){
                int count=0;
                int a1=0;int a2=0; int a3=0; int a4=0;
                for(int j=0;j<N;j++){
                    if((locate[j][0]<a) && (locate[j][1]<b)){
                        a1++;
                    }else if(locate[j][0]<a && locate[j][1]>b){
                        a2++;
                    }else if(locate[j][0]>a && locate[j][1]<b){
                        a3++;
                    }else if(locate[j][0]>a && locate[j][1]>b){
                        a4++;
                    }
                }

                count=Math.max(a1,a2);
                count=Math.max(count,a3);
                count=Math.max(count,a4);

                min=Math.min(count,min);
            }
        }




        System.out.println(min);

    }
}