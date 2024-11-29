import java.util.Scanner;
import java.util.HashMap;

public class Main {    
    public static final int MAX_N = 100000;
    
    public static int n;
    public static String[] words = new String[MAX_N];
    public static HashMap<String, Integer> freq = new HashMap<>();
    
    public static int ans; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++)
            words[i] = sc.next();
        

        for(int i = 0; i < n; i++) {
            if(!freq.containsKey(words[i]))
                freq.put(words[i], 1);
            else
                freq.put(words[i], freq.get(words[i]) + 1);
            
            ans = Math.max(ans, freq.get(words[i]));
        }

        System.out.print(ans);
    }
}