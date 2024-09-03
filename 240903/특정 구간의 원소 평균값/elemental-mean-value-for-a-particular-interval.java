import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[N];
        int count=0;

        for(int i=0; i<N; i++){
            array[i]=sc.nextInt();
        }

        for(int a=0; a<N; a++){
            for(int b=a;b<N;b++){
                int sum=0;
                for(int c=a;c<=b;c++){
                    sum+=array[c];
                        }
                double avg=(double)sum/(b-a+1);

                boolean exists = false;
                for(int d=a;d<=b;d++){
                    if(array[d]==avg){
                        exists = true;
                    }
                }
                if(exists)
                    count++;
            }
        }

        System.out.println(count);

        }
    }