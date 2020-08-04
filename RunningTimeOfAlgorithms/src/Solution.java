import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int totalShifts = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for(int i = 1; i < n; i++) {
            int j = i;
            int value = array[i];
            int count = 0;
            while (j >= 1 && array[j - 1] > value){
                array[j] = array[j - 1];
                j--;
                count++;
            }
            array[j] = value;

            totalShifts += count;
        }

        System.out.println(totalShifts);
    }
}