import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] locate = new int[N][2];
        int min = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            locate[i][0]=sc.nextInt();
            locate[i][1]=sc.nextInt();
        }

       for(int a=0; a<N; a++){
          int x1=Integer.MAX_VALUE;
          int x2=0;
          int y1=Integer.MAX_VALUE;
          int y2=0;
           for(int b=0;b<N;b++){
               if(b==a)
                   continue;

               x1=Math.min(x1,locate[b][0]);
               x2=Math.max(x2,locate[b][0]);
               y1=Math.min(y1,locate[b][1]);
               y2=Math.max(y2,locate[b][1]);

           }
           
           min=Math.min(min, (x2-x1)*(y2-y1));

       }

        System.out.println(min);

    }
}