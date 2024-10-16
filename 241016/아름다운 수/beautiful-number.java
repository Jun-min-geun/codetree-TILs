import java.util.*;

public class Main {
    public static int n;
    public static int count=0;
    public static ArrayList<Integer> selectedNums = new ArrayList<>();

    // 출력
    public static boolean checkRight() {
        for(int i=0;i<n;i++){
            int num=selectedNums.get(i);
            if(num==1){
                continue;
            }
            int cnt=1;

            while(i <= n-2) {
                if(selectedNums.get(i+1) != num)
                    break;
                cnt++;
                i++;
            }
            if(cnt % num != 0)
                return false;
        }

        return true;
    }

    public static void findPermutations(int cnt) {
        // n개 뽑
        if(cnt == n) {
            if(checkRight()){
                count++;
            }
            return;
        }

        //
        for(int i = 1; i <= 4; i++) {
            selectedNums.add(i);
            findPermutations(cnt + 1);
            selectedNums.remove(selectedNums.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        findPermutations(0);

        System.out.println(count);
    }
}