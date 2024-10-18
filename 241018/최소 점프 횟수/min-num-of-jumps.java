import java.util.*;

public class Main {
    public static int n;
    public static int min = Integer.MAX_VALUE;
    public static int num;

    public static int[] array = new int[9999];

    public static void findPermutations(int locate) {
        int way = array[locate];
        // 
        if(locate >= n) {
            min=Math.min(min,num);
            return;
        }

        for (int i = 1; i <= way; i++) {

            num++;
            findPermutations(locate+i);
            num--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i=1; i<=n;i++){
            array[i]=sc.nextInt();
        }



        findPermutations(1);

        if(min==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(min);
        }

    }
}