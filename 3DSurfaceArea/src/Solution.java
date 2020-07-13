import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        int area = 0;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                area += (array[i][j] * 4) + 2;
                if (j >= 1){
                    area -= Math.min(array[i][j-1], array[i][j]) * 2;
                }
                if (i >= 1){
                    area -= Math.min(array[i-1][j], array[i][j]) * 2;
                }
            }
        }

        System.out.println(area);
    }
}
