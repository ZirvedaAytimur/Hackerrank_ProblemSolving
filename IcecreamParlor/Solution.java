import java.util.Scanner;

public class Solution {

    static int[] icecreamParlor(int m, int[] arr) {
        int[] solution = new int[2];
        int i, j = 0;
        
        for (i = 0; i < arr.length - 1; i++){
            for (j = i + 1; j < arr.length; j++){
                if((arr[i] + arr[j]) == m & i != j) {
                    solution[0] = i + 1;
                    solution[1] = j + 1;
                    break;
                }
            }
        }
        
        return solution;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        int m, n;
        int[] cost;
        int[] solution;
        for (int i = 0; i < t; i++){
            m = input.nextInt();
            n = input.nextInt();
            cost = new int[n];
            for (int j = 0; j < n; j++){
                cost[j] = input.nextInt();
            }
            
            solution = icecreamParlor(m, cost);
            System.out.println(solution[0] + " " + solution[1]);
        }
    }
}