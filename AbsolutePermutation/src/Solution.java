import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        for (int i = 0; i < test; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int temp = k;

            if (k == 0){
                for (int j = 1; j <= n; j++) {
                    System.out.print(j + " ");
                }
            } else if ((n % (2 * k)) == 0) {
                for (int j = 1; j <= n; j++){
                    System.out.print(j + temp + " ");
                    if (j % k == 0) {
                        temp *= -1;
                    }
                }
            } else {
                System.out.print("-1");
            }

            System.out.println();
        }
    }
}
