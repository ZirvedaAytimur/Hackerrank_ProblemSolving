import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        boolean[] alphaList = new boolean[26];
        int index = 0, flag = 1;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                index = s.charAt(i) - 'A';
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                index = s.charAt(i) - 'a';
            }

            alphaList[index] = true;
        }

        for (int i = 0; i <= 25; i++){
            if (!alphaList[i])
                flag = 0;
        }

        if (flag == 1){
            System.out.println("pangram");
        } else System.out.println("not pangram");
    }
}
