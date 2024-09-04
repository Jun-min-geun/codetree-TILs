import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] locate = new int[N][2];
        int count = 0;

        for(int i=0; i<N; i++){
            locate[i][0]=sc.nextInt();
            locate[i][1]=sc.nextInt();
        }

        for(int a=0; a<N; a++){
            boolean cross = true;
            for(int b=0; b<N; b++){
                if(a==b)
                    continue;
                
                if(locate[a][0]<locate[b][0] && locate[a][1]>locate[b][1]){
                    cross=false;
                    break;
                }
                if(locate[a][0]>locate[b][0] && locate[a][1]<locate[b][1]){
                    cross=false;
                    break;
                }
            }
            if(cross){
                count++;
            }
        }


        System.out.println(count);

    }
}