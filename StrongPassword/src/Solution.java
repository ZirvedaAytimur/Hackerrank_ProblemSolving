import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String password = scanner.nextLine();

        String specialCharacters = "!@#$%^&*()-+";
        int counter = 0;

        if (password.chars().noneMatch(Character::isDigit)) {
            counter++;
        }

        if (password.chars().noneMatch(Character::isLowerCase)) {
            counter++;
        }

        if (password.chars().noneMatch(Character::isUpperCase)) {
            counter++;
        }

        if (password.chars().noneMatch(ch -> specialCharacters.indexOf((char) ch) >= 0)) {
            counter++;
        }

        System.out.println(Math.max(counter, 6 - n));
    }
}
