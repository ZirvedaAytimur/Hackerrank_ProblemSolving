import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int d=scanner.nextInt();
        int count=0;
        int indicator=0;

        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=scanner.nextInt();

        Arrays.sort(arr);
        while (indicator<=n-3){
            for(int element:arr){
                if(element==(arr[indicator]+d))
                    for (int element2:arr){
                        if (element2==arr[indicator]+d+d)
                            count++;
                    }
            }
            indicator++;
        }

        System.out.println(count);
    }
}
