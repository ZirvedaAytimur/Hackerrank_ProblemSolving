import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int max=0;

        int[] height=new int[n];

        for (int i=0;i<n;i++){
            height[i]=scanner.nextInt();
            if (max<height[i])
                max=height[i];
        }

        if (k<max)
            System.out.println(max-k);
        else System.out.println("0");
    }
}
