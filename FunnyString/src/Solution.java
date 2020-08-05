import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        scanner.nextLine();
        for (int a0 = 0; a0 < test; a0++) {
            String s = scanner.nextLine();
            boolean check = true;
            for (int i = 0; i < s.length() / 2; i++) {
                int l = (s.length() - 1) - i;
                int a = (int)s.charAt(i);
                int b = (int)s.charAt(i + 1);
                int c = (int)s.charAt(l);
                int d = (int)s.charAt(l - 1);
                if (Math.abs(a - b) != Math.abs(c - d)){
                    check = false;
                }
            }

            System.out.println(check ? "Funny" : "Not Funny");
        }
    }
}
