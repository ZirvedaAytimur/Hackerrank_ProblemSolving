import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int k = scanner.nextInt() % 26;

        for (char letter : s.toCharArray()) {
            if (letter > 64 && letter < 91) {
                char encrypted = (char)(letter + k);
                if (encrypted > 90){
                    encrypted = (char)((encrypted % 90) + 64);
                }
                System.out.print(encrypted);
            } else if (letter > 96 && letter < 123) {
                char encrypted = (char)(letter + k);
                if (encrypted > 122) {
                    encrypted = (char)((encrypted % 122) + 96);
                }
                System.out.print(encrypted);
            } else {
                System.out.print(letter);
            }
        }
    }
}
