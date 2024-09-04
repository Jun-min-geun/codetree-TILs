import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] locate = new int[N][2];
        int max = 0;

        for(int i=0; i<N; i++){
            locate[i][0]=sc.nextInt();
            locate[i][1]=sc.nextInt();
        }

        for(int a=0; a<N; a++){
            int[] all = new int[1000];
            int count=0;
            for(int j=0; j<N; j++){
                if(j==a)
                    continue;
                
                for(int b=locate[j][0];b<locate[j][1];b++){
                    all[b]++;
                }
            }
            for(int c=0;c<1000;c++){
                if(all[c]!=0){
                    count++;
                }
            }
            
            max=Math.max(max,count);
        }


        System.out.println(max);

    }
}