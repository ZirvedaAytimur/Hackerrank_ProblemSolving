import java.util.*;

public class Solution {

    private static Set<Character> convert(String s) {
        Set<Character> set = new HashSet<>(26);
        for (char c : s.toCharArray()){
            set.add(c);
        }

        return set;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        scanner.nextLine();

        Set<Character> set = convert(scanner.nextLine());
        for (int i = 1; i < test; i++) {
            set.retainAll(convert(scanner.nextLine()));
        }

        System.out.print(set.size());
    }
}
