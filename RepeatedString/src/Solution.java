import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        long n = scanner.nextLong();
        long numberOfA = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                numberOfA++;
        }

        numberOfA *= (n / s.length());
        for (int i = 0; i < (n % s.length()); i++) {
            if (s.charAt(i) == 'a')
                numberOfA++;
        }

        System.out.println(numberOfA);
    }
}
