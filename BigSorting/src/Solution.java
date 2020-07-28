import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            unsorted[i] = scanner.next();
        }

        Arrays.sort(unsorted, (x, y) ->
                x.length() == y.length() ? x.compareTo(y) : Integer.compare(x.length(), y.length()));

        for (int i = 0; i < n; i++) {
            System.out.println(unsorted[i]);
        }
    }
}
