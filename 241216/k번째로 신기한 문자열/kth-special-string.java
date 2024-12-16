import java.util.*;

public class Main {
    public static final int MAX_N = 100;
    
    public static int n, k;
    public static String t;
    public static int cnt;
    
    public static String[] str = new String[MAX_N];
    public static String[] words = new String[MAX_N];

    public static boolean startsWith(String a, String b) {
        if((int) a.length() < (int) b.length())
            return false;

        for(int i = 0; i < (int) b.length(); i++)
            if(a.charAt(i) != b.charAt(i))
                return false;
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        t = sc.next();
        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
            
            if(startsWith(str[i], t))
                words[cnt++] = str[i];
        }
        
        Arrays.sort(words, 0, cnt);
        
        System.out.print(words[k - 1]);
    }
}