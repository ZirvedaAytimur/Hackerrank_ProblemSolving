import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int b,n,m,max=-1,sum;

        b=scanner.nextInt();
        n=scanner.nextInt();
        m=scanner.nextInt();

        int[] keyboard=new int[n];
        int[] drives=new int[m];

        for (int i=0;i<n;i++){
            keyboard[i]=scanner.nextInt();
        }

        for(int i=0;i<m;i++){
            drives[i]=scanner.nextInt();
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                sum=keyboard[i]+drives[j];
                if (sum<=b&&sum>max){
                    max=sum;
                }
            }
        }

        System.out.println(max);
    }
}
