import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] possibleOnes = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };

        int[][] s = new int[3][3];
        int minCost=Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                s[i][j] = scanner.nextInt();
        }

        for (int i=0;i<8;i++){
            int cost=0;

            for (int j=0;j<3;j++){
                for (int k=0;k<3;k++){
                    cost+=Math.abs(s[j][k]-possibleOnes[i][j][k]);
                }
            }
            minCost=Math.min(minCost,cost);
        }

        System.out.println(minCost);
    }
}



