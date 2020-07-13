import java.util.Scanner;

public class Solution {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        long test = scanner.nextLong();
        long remainder = 3;

        while (test > remainder) {
            test -= remainder;
            remainder *= 2;
        }

        System.out.println(remainder - test +1);
    }
}
