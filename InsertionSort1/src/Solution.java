import java.util.Scanner;

public class Solution {

    static void sort(int[] array) {
        for (int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                for (int k = 0; k < array.length; k++){
                    System.out.print(array[k] + " ");
                }
                System.out.println();
                j = j - 1;
            }
            array[j + 1] = key;
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        sort(array);
    }
}
