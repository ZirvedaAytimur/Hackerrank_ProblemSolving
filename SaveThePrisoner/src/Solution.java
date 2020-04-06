import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //number of test cases
        int tests=scanner.nextInt();

        for (int i=0;i<tests;i++) {
            //number of prisoners
            int numberOfPrisoners = scanner.nextInt();
            //number of sweets
            int numberofSweets = scanner.nextInt();
            //the chair number to start passing out treats at
            int startPoint = scanner.nextInt();

            int poisonedPrisoner=(startPoint+numberofSweets-1)%numberOfPrisoners;
            if(poisonedPrisoner == 0){poisonedPrisoner=numberOfPrisoners;}
            System.out.println(poisonedPrisoner);
        }
    }
}
