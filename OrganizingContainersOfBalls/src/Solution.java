import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int q=scanner.nextInt();

        for (int i=0;i<q;i++){
            int n=scanner.nextInt();
            int[] row=new int[n];
            int[] col=new int[n];

            for (int j=0;j<n;j++){
                for (int m=0;m<n;m++) {
                    //sum of columns and rows
                    int x = scanner.nextInt();
                    row[j] += x;
                    col[m] += x;
                }
            }
            Arrays.sort(row);
            Arrays.sort(col);
            String result="Possible";
            for (int j=0;j<n;j++){
                if (row[j]!=col[j]){
                    result="Impossible";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
