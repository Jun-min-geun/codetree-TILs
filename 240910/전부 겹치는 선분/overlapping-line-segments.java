import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int[][] array = new int[n][2];
       boolean cross = false;

       for(int i=0;i<n;i++){
           array[i][0]=sc.nextInt();
           array[i][1]=sc.nextInt();
       }

       for(int a=0;a<n;a++){
           for(int b=a+1;b<n;b++){
               if(array[a][1]>=array[b][0] || array[b][1]>=array[a][0]){
                   cross=true;
                   break;
               }
           }
       }

       if(cross){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
    }
}