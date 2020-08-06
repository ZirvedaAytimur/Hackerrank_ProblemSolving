import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String b = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            if (b.charAt(i) == '0' && b.charAt(i + 1) == '1' && b.charAt(i + 2) == '0') {
                count++;
                i = i + 2;
            }
        }

        System.out.println(count);
    }
}
