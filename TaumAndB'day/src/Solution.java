import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int test=scanner.nextInt();

        for (int i=0;i<test;i++){

            long b=scanner.nextLong();
            long w=scanner.nextLong();
            long bc=scanner.nextLong();
            long wc=scanner.nextLong();
            long z=scanner.nextLong();
            long result;

            if (Math.abs(bc-wc)<z){
                result=b*bc+w*wc;
            } else {
                if (bc<wc){
                    result=b*bc+w*(bc+z);
                } else result=b*(wc+z)+w*wc;
            }

            System.out.println(result);
        }
    }
}
