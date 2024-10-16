import java.util.*;

public class Main {
    public static int k, n;
    public static ArrayList<Integer> selectedNums = new ArrayList<>();

    // 출력
    public static void printPermutation() {
        for(int i = 0; i < selectedNums.size(); i++)
            System.out.print(selectedNums.get(i) + " ");
        System.out.println();
    }

    public static void findPermutations(int cnt) {
        // n개 뽑
        if(cnt == n) {
            printPermutation();
            return;
        }

        // 
        for(int i = 1; i <= k; i++) {
            selectedNums.add(i);
            findPermutations(cnt + 1);
            selectedNums.remove(selectedNums.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        k = sc.nextInt();
        n = sc.nextInt();

        findPermutations(0);
    }
}