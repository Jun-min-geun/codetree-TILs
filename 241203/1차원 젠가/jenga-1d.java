import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;

    public static int n;
    public static int[] numbers = new int[MAX_N];

    public static int endOfArray;

    public static void cutArray(int startIdx, int endIdx) {
        int[] tempArr = new int[MAX_N];
        int endOfTempArray = 0;
        for(int i = 0; i < endOfArray; i++)
            if(i < startIdx || i > endIdx)
                tempArr[endOfTempArray++] = numbers[i];
        
        for(int i = 0; i < endOfTempArray; i++)
            numbers[i] = tempArr[i];
        
        endOfArray = endOfTempArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            numbers[i] = sc.nextInt();
        
        endOfArray = n;
	
        for(int k = 0; k < 2; k++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            s--; e--;
            cutArray(s, e);
        }
        
        System.out.println(endOfArray);
        for(int i = 0; i < endOfArray; i++)
            System.out.println(numbers[i]);
    }
}