import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] array = new int[N];
        int[] answer = new int[M];
        int count=0;

        for(int i=0; i<N; i++){
            array[i]=sc.nextInt();
        }
        for(int i=0; i<M; i++){
            answer[i]=sc.nextInt();
        }

        for(int a=0;a<=N-M;a++){
            boolean beauty = false;
            for(int b=a;b<a+M;b++){
                beauty=false;
                for(int c=0;c<M;c++){
                    if(array[b]==answer[c]){
                        beauty=true;
                    }
                }
                if(!beauty){
                    break;
                }
            }
            if(beauty){
                count++;
            }
        }


        System.out.println(count);

        }
    }