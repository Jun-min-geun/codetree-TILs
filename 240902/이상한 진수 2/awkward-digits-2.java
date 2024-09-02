import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        String n2 = sc.nextLine();

        int[] array = new int[n2.length()];

        for(int i=0; i<n2.length(); i++){
            array[i]=n2.charAt(i)- '0';
        }

        for(int j=0; j<array.length; j++){
            if(array[j]==0){
                array[j]=1;
                break;
            }
            if(array[j]==1 && j==array.length-1){
                array[j]=0;
            }
        }

        for(int a=0; a<array.length; a++){
            int hex = 1;
            for(int b=0; b<array.length-a-1; b++){
                hex=hex*2;
            }
            num+=array[a]*hex;
        }

        System.out.println(num);

    }
}