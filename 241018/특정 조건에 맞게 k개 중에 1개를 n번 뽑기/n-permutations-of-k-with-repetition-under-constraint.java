import java.util.*;

public class Main {
    public static int n,k;

    public static ArrayList<Integer> array = new ArrayList<>();

    // 출력
    public static void checkMax() {
        for(int i=0; i<array.size();i++){
            System.out.print(array.get(i)+" ");
        }
        System.out.println();
    }


    public static void findPermutations(int cnt) {
        // n개 뽑
        if(cnt == n) {
            checkMax();
            return;
        }

        for (int i = 1; i <= k; i++) {
            if (cnt >= 2 &&
                    i == array.get(array.size() - 1) &&
                    i == array.get(array.size() - 2))
                continue;

            array.add(i);
            findPermutations(cnt + 1);
            array.remove(array.size() - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        k = sc.nextInt();
        n = sc.nextInt();


        findPermutations(0);

    }
}