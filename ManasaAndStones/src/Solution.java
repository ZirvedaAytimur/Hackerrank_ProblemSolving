import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        for (int i = 0; i < test; i++) {
            int n = scanner.nextInt();
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            int a = Math.min(first, second);
            int b = Math.max(first, second);

            if (a < b) {
                for (int j = 0; j <= n - 1; j++) {
                    System.out.print((a * (n - j - 1)) + (b * j) + " ");
                }
            }
            else System.out.print(a * (n - 1) + " ");
            System.out.println();
        }
    }
}
