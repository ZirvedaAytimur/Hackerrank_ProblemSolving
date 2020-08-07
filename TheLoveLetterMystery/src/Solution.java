import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        for (int a0 = 0; a0 < n; a0++) {
            String s = scanner.nextLine();
            int count = 0, i = 0, j = s.length() - 1;

            while (i < j) {
                count += Math.abs(s.charAt(i) - s.charAt(j));
                i++;
                j--;
            }

            System.out.println(count);
        }
    }
}
