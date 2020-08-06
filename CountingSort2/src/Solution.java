import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[100];

        for (int i = 0; i < n; i++){
            int add = scanner.nextInt();
            array[add]++;
        }

        for (int i = 0; i < 100; i++){
            for (int j = 0; j < array[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}