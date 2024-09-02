import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;

        int n =sc.nextInt();
        String[] array = new String[n];
        for(int i=0; i<n;i++){
            array[i]=sc.nextLine();
        }

        for(int a=0; a<n-2; a++){
            for(int b=a+1; b<n-1; b++){
                for(int c=b+1;c<n;c++){
                    int q = isCarry(array[a],array[b],array[c]);
                        max=Math.max(max,q);
                }
            }
        }


        System.out.println(max);
    }

    private static int isCarry(String a, String b, String c) {
        int[] one = new int[]{0,0,0,0,0};
        int[] two = new int[]{0,0,0,0,0};
        int[] three = new int[]{0,0,0,0,0};
        int[] num = new int[]{0,0,0,0,0};

        for(int i=0;i<a.length();i++){
            one[5-a.length()+i]=a.charAt(i)-'0';
        }
        for(int j=0;j<b.length();j++){
            two[5-b.length()+j]=b.charAt(j)-'0';
        }
        for(int k=0;k<c.length();k++){
            three[5-c.length()+k]=c.charAt(k)-'0';
        }

        for(int q=0; q<5; q++){
            if(one[q]+two[q]+three[q]>=10){
                return -1;
            }
        }

        for(int z=0; z<5;z++){
            num[z]=one[z]+two[z]+three[z];
        }

        return num[0]*10000+num[1]*1000+num[2]*100+num[3]*10+num[4];
    }
}