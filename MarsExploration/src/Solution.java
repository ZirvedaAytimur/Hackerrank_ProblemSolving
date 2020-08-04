import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int k =  i % 3;
            if (k == 0 && s.charAt(i) != 'S') {
                count++;
            } else if (k == 1 && s.charAt(i) != 'O') {
                count++;
            } else if (k == 2 && s.charAt(i) != 'S') {
                count++;
            }
        }

        System.out.println(count);
    }
}
