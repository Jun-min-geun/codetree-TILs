import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Pair implements Comparable<Pair> { 
    int cnt, num;
    public Pair(int cnt, int num) { 
        this.cnt = cnt; 
        this.num = num; 
    }
    @Override
    public int compareTo(Pair b) {
        if(cnt != b.cnt) return cnt - b.cnt;
        return num - b.num;
    }
}

public class Main {
    public static final int MAX_N = 100000;
    
    // 변수 선언
    public static int n, k;
    public static int[] arr = new int[MAX_N];
    public static HashMap<Integer, Integer> freq = new HashMap<>();
    public static ArrayList<Pair> v = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(!freq.containsKey(arr[i]))
                freq.put(arr[i], 1);
            else
                freq.put(arr[i], freq.get(arr[i]) + 1);
        }

        for(Integer key : freq.keySet()) {
            v.add(new Pair(freq.get(key), key));
        }

        Collections.sort(v);

        for(int i = (int)v.size() - 1; i >= (int)v.size() - k; i--)
            System.out.print(v.get(i).num + " ");
    }
}