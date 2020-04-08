import java.util.Scanner;

public class Solution {

    static boolean diff(String s1, String s2,int numOperations) {

        if (numOperations>=s1.length()+s2.length())
            return true;
        for (int i=s1.length();;i--){
            String prefixS = s1.substring(0, i);
            if (s2.startsWith(prefixS)) {
                int diff = (s1.length() - i) + (s2.length() - i);
                //5. test case de 2 den küçük işlem girmiş ondan mod 2 yaptık
                return diff<=numOperations&&(numOperations-diff)%2==0;
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String initialString=scanner.nextLine();
        String finalString=scanner.nextLine();

        int numOperations=scanner.nextInt();
        boolean solution=diff(initialString,finalString,numOperations);

        if (solution)
            System.out.println("Yes");
        else System.out.println("No");
    }
}
