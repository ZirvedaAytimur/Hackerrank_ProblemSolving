import java.util.Scanner;

class CountSquares {
    double countSquares(int first, int second)
    {
        return (Math.floor(Math.sqrt(second)) - Math.ceil(Math.sqrt(first)) + 1);
    }
}
// Driver Code 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int tests=scanner.nextInt();
        for (int i=0;i<tests;i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            CountSquares obj = new CountSquares();
            System.out.println((int) obj.countSquares(first, second));
        }
    }
}