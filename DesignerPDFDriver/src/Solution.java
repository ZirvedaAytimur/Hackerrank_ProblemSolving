import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int[] h=new int[26];
        for (int i=0;i<26;i++){
            h[i]=scanner.nextInt();
        }
        scanner.nextLine();

        String word=scanner.nextLine();
        int max=0;

        for (int i=0;i<word.length();i++){
            int ascii=(int) word.charAt(i);
            if (max<h[ascii-97])
                max=h[ascii-97];
        }
        System.out.println(max*word.length());
    }
}
