import java.util.*;

public class Main {
    public static int n,k,m;
    public static int max = Integer.MIN_VALUE;

    public static int[] array = new int[9999];
    public static int[] locate = new int[9999];

    // 출력
    public static void checkMax() {
        int count = 0;
        for(int i=1; i<=k;i++){
            if(locate[i]==m){
                count++;
            }
        }

        max=Math.max(max,count);
    }


    public static void findPermutations(int cnt) {
        // n개 뽑
        if(cnt == n) {
            checkMax();
            return;
        }

        for (int i = 1; i <= k; i++) {

            if(locate[i]==m){
                continue;
            }
            else if(locate[i]+array[cnt]>=m){
                locate[i]=m;
            }
            else{
                locate[i]=locate[i]+array[cnt];
            }

            findPermutations(cnt+1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        for(int i=0; i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int j=1; j<=k;j++){
            locate[j]=1;
        }


        findPermutations(0);


        System.out.println(max);
    }
}