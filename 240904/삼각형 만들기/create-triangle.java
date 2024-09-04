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
          for(int b=a+1; b<N; b++){
              for(int c=b+1; c<N; c++){
                  if(locate[a][0]==locate[b][0] || locate[b][0]==locate[c][0] || locate[c][0]==locate[a][0]){
                      if(locate[a][1]==locate[b][1] || locate[b][1]==locate[c][1] || locate[c][1]==locate[a][1]){
                          max=Math.max(max,Math.abs((locate[a][0]*locate[b][1]+locate[b][0]*locate[c][1]+locate[c][0]*locate[a][1])-(locate[b][0]*locate[a][1]+locate[c][0]*locate[b][1]+locate[a][0]*locate[c][1])));
                      }
                  }
              }

          }


       }

        System.out.println(max);

    }
}