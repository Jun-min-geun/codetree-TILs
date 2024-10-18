import java.util.*;

public class Main {
    public static int n, m;
    public static int min = Integer.MAX_VALUE;
    public static int[][] array;
    public static ArrayList<Integer> chooseX = new ArrayList<>();
    public static ArrayList<Integer> chooseY = new ArrayList<>();

    public static void printCombination() {
        int value = 0;
        for(int i = 0; i < chooseX.size(); i++){
            for(int j=i;j<chooseX.size();j++){
                int distance = (chooseX.get(i)-chooseX.get(j))*(chooseX.get(i)-chooseX.get(j))+(chooseY.get(i)-chooseY.get(j))*(chooseY.get(i)-chooseY.get(j));
                
                value=Math.max(value,distance);
            }
        }

        min=Math.min(value,min);
    }

    public static void findCombination(int currNum, int cnt) {
        if(currNum == n+1) {
            if(cnt == m)
                printCombination();
            return;
        }

        // currNum에 해당하는 숫자를 사용했을 때의 경우
        chooseX.add(array[currNum][0]);
        chooseY.add(array[currNum][1]);
        findCombination(currNum + 1, cnt + 1);
        chooseX.remove(chooseX.size() - 1);
        chooseY.remove(chooseY.size() - 1);

        // currNum에 해당하는 숫자를 사용하지 않았을 때의 경우
        findCombination(currNum + 1, cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        array = new int[n+1][2];

        for(int i=1; i<=n; i++){
            array[i][0]=sc.nextInt();
            array[i][1]=sc.nextInt();
        }

        findCombination(1, 0);

        System.out.println(min);
    }
}