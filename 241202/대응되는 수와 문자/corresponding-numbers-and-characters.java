import java.util.*;

public class Main {
    public static final int MAX_N = 100000;
    public static int n, m;
    public static String[] words = new String[MAX_N + 1];
    public static HashMap<String, Integer> StringToNum = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            words[i] = sc.next();
            StringToNum.put(words[i], i);
        }

        while(m-- > 0) {
            String key = sc.next();

            if('0' <= key.charAt(0) && key.charAt(0) <= '9')
                System.out.println(words[Integer.parseInt(key)]);
            
            else
                System.out.println(StringToNum.get(key));
        }
    }
}