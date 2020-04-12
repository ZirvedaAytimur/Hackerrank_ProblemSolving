import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static int findPopular(int[] a) {

        if (a == null || a.length == 0)
            return 0;

        Arrays.sort(a);

        int previous = a[0];
        int popular = a[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == previous)
                count++;
            else {
                if (count > maxCount) {
                    popular = a[i-1];
                    maxCount = count;
                }
                previous = a[i];
                count = 1;
            }
        }

        return count > maxCount ? count : maxCount;

    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=scanner.nextInt();

        int count=findPopular(arr);

        System.out.println(arr.length-count);
    }
}
