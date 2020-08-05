import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int a0 = 0; a0 < test; a0++) {
            String s = in.next();
            boolean valid = false;
            long firstNumber = -1;

            for (int i=1; i<=s.length()/2; i++) {
                long initialNumber = Long.parseLong(s.substring(0,i));
                firstNumber = initialNumber;
                String check = Long.toString(initialNumber);
                while (check.length() < s.length()) {
                    check += Long.toString(++initialNumber);
                }
                if (check.equals(s)) {
                    valid = true;
                    break;
                }
            }
            System.out.println(valid ? "YES " + firstNumber : "NO");
        }
    }
}
