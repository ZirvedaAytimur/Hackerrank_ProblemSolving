import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        int min = Integer.MAX_VALUE;
        int k = 0;
        int[] answer = new int[n * 2];
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(array[i] - array[i + 1]) == min) {
                answer[k++] = array[i];
                answer[k++] = array[i + 1];
            } else if (Math.abs(array[i] - array[i + 1]) < min) {
                k = 0;
                answer[k++] = array[i];
                answer[k++] = array[i + 1];
                min = Math.abs(array[i] - array[i + 1]);
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
