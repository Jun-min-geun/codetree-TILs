import java.util.*;

public class Main {
    public static int n;
    public static int max = Integer.MIN_VALUE;
    public static int num;

    public static int[] array = new int[9999];

    public static void findPermutations(int cnt) {
        int way = array[cnt];
        // n개 뽑
        if(cnt == n) {
            max=Math.max(max,num);
            num=0;
            return;
        }

        for (int i = 1; i <= way; i++) {
            if(array[cnt]+i>=n){
                num++;
                findPermutations(n);
                num--;
                continue;
            }

            num++;
            findPermutations(array[cnt]+i);
            num--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i=0; i<n;i++){
            array[i]=sc.nextInt();
        }



        findPermutations(1);


        System.out.println(max);
    }
}