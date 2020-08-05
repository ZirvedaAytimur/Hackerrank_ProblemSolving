import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < 100; i++){
            array[i] = 0;
        }
        for (int i = 0; i < n; i++){
            int add = scanner.nextInt();
            array[add]++;
        }

        for (int i = 0; i < 100; i++){
            System.out.print(array[i] + " ");
        }
    }
}
