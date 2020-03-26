import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, p, turns;

        n = scanner.nextInt();
        p = scanner.nextInt();


        if (p % 2 != 0)
            p--;
        if (n % 2 != 0)
            n--;
        if (p < (n / 2))
            turns = p / 2;
        else turns = (n - p) / 2;

        System.out.println(turns);
    }
}
