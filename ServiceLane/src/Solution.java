import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //number of array size
        int n=scanner.nextInt();
        //test
        int t=scanner.nextInt();

        int[] array=new int[n];
        for (int i=0;i<n;i++)
            array[i]=scanner.nextInt();

        for (int i=0;i<t;i++){
            int begin=scanner.nextInt();
            int end=scanner.nextInt();
            int min=Integer.MAX_VALUE;

            for (int j=begin;j<=end;j++){
                if (array[j]<min)
                    min=array[j];
            }

            System.out.println(min);
        }
    }
}
