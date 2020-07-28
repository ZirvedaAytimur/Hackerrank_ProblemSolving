import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int search = scanner.nextInt();
        int length = scanner.nextInt();
        int i;

        int[] array = new int[length];
        for (i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] == search) {
                break;
            }
        }

        System.out.println(i);
    }
}
