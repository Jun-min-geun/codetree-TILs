import java.util.*;

public class Main {
    public static int n, m;
    public static int max = Integer.MIN_VALUE;
    public static int[] array;
    public static ArrayList<Integer> combination = new ArrayList<>();

    public static void printCombination() {
        int value = 0;
        for(int i = 0; i < combination.size(); i++)
            value=value^combination.get(i);

        max=Math.max(value,max);
    }

    public static void findCombination(int currNum, int cnt) {
        if(currNum == n+1) {
            if(cnt == m)
                printCombination();
            return;
        }

        // currNum에 해당하는 숫자를 사용했을 때의 경우
        combination.add(array[currNum]);
        findCombination(currNum + 1, cnt + 1);
        combination.remove(combination.size() - 1);

        // currNum에 해당하는 숫자를 사용하지 않았을 때의 경우
        findCombination(currNum + 1, cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        array = new int[n];

        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }

        findCombination(1, 0);

        System.out.println(max);
    }
}