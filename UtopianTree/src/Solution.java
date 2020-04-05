import java.util.Scanner;

public class Solution {

    //function to calculate each tests
    static int calculateHeight(int n){
        int height=0;

        for (int j = 0; j <= n; j++) {
            //if number is even season is summer,its height increases by 1
            if (j % 2 == 0)
                height++;
            //else season is spring it doubles is height
            else height *= 2;
        }

        return height;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //number of test cases
        int t=scanner.nextInt();
        int height;

        for (int i=0;i<t;i++) {
            //number of cycles for test case
            int n=scanner.nextInt();
            height=calculateHeight(n);
            System.out.println(height);
        }
    }
}
