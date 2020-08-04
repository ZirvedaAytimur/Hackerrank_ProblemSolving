import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int max = 0;

        if (length == 1) {
            System.out.println(max);
        } else {
            for (int i = 0; i < 26; i++) {
                nextLetter:
                for (int j = i + 1; j < 26; j++) {
                    char first = (char)('a' + i);
                    char second = (char)('a' + j);
                    char lastSeen ='\u0000';
                    int patLength = 0;

                    for (char letter : s.toCharArray()) {
                        if (letter == first || letter == second) {
                            if (letter == lastSeen){
                                continue nextLetter;
                            }

                            patLength++;
                            lastSeen = letter;
                        }
                    }

                    max = (patLength > max) ? patLength : max;
                }
            }

            System.out.println(max);
        }
    }
}
