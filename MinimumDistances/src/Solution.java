import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int min=Integer.MAX_VALUE;

        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }

        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if ((array[i] == array[j]) && (i != j))
                {
                    if (Math.abs(i-j)<min)
                        min=Math.abs(i-j);
                }
            }
        }

        if (min!=Integer.MAX_VALUE)
            System.out.println(min);
        else System.out.println("-1");
    }
}
