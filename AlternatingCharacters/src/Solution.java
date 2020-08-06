import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        scanner.nextLine();

        for (int a0 = 0; a0 < test; a0++) {
            String s = scanner.nextLine();
            int count = 0;

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
