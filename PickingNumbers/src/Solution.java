import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int calculate(int[] a){
        Arrays.sort(a);

        int start=0,i=0,max=0;

        while (i<a.length){
            if (Math.abs(a[start]-a[i])>1){
                start=i;
            }
            max=Math.max(max,i-start+1);
            i++;
        }
        i--;

        return Math.max(max,i-start+1);
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        int[] a=new int[n];
        int solution;

        for (int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }

        solution=calculate(a);

        System.out.println(solution);
    }
}
