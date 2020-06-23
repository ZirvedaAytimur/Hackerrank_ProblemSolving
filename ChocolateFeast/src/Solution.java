import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // number of tests
        int t=scanner.nextInt();
        for (int i=0;i<t;i++){
            //money
            int n=scanner.nextInt();
            //cost
            int c=scanner.nextInt();
            //cost with wrapper
            int m=scanner.nextInt();
            int chocolateBar,total=0,wrapper;

            chocolateBar=n/c;
            total+=chocolateBar;
            wrapper=chocolateBar;
            while (wrapper>=m) {
                chocolateBar = wrapper / m;
                total += chocolateBar;
                wrapper=chocolateBar+(wrapper%m);
            }
            System.out.println(total);
        }
    }
}
