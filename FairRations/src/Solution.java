import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // the number of subjects in the bread line.
        int numberOfSubjects = scanner.nextInt();

        int sum = 0;
        int count = 0;

        int[] bread = new int[numberOfSubjects];
        for (int i = 0; i < numberOfSubjects; i++){
            bread[i] = scanner.nextInt();
            sum += bread[i];
        }

        if (sum % 2 != 0){
            System.out.println("NO");
        } else {
            for (int i = 0; i < numberOfSubjects; i++){
                if (bread[i] % 2 != 0) {
                    bread[i]++;
                    bread[i+1]++;
                    count += 2;
                }
            }

            System.out.println(count);
        }
    }
}
