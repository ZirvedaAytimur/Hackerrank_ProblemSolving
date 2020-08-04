import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        scanner.nextLine();
        tests:
        for (int i = 0; i < test; i++) {
            String s = scanner.nextLine();
            char[] hacker = "hackerrank".toCharArray();
            int findIndex = 0;

            for (char c : s.toCharArray()) {
                if (hacker[findIndex] == c)
                    findIndex++;

                if (findIndex == hacker.length){
                    System.out.println("YES");
                    continue tests;
                }
            }

            System.out.println("NO");
        }
    }
}
