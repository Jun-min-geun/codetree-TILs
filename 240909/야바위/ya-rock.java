import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];

        
        int max= 0;

        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
        }

        for(int j=1;j<=3;j++){
            int[] cup = new int[4];
            cup[j]=1;
            int count=0;
            for(int k=0;k<N;k++){
                int base=0;
                base=cup[a[k]];
                cup[a[k]]=cup[b[k]];
                cup[b[k]]=base;

                if(cup[c[k]]==1){
                    count++;
                }
            }

            max=Math.max(count,max);
        }



        System.out.println(max);

    }
}