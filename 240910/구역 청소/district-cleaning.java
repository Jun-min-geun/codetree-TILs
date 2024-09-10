import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int totalLength = (b - a) + (d - c);
        
        int overlapStart = Math.max(a, c);
        int overlapEnd = Math.min(b, d);
        
        int overlapLength = Math.max(0, overlapEnd - overlapStart);
        int cleanedArea = totalLength - overlapLength;

        System.out.println(cleanedArea);
    }
}