import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int n = scanner.nextInt();
        char[] array = s.toCharArray();
        int count = 1;
        int lastLetter = 0;
        Set<Integer> numList = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int alpha = array[i] - 'a' + 1;
            if (alpha == lastLetter){
                count++;
            } else {
                count = 1;
                lastLetter = alpha;
            }
            int num = alpha * count;
            numList.add(num);
        }

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (numList.contains(x)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
