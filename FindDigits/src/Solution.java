import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //number of tests
        int test=scanner.nextInt();

        for (int i=0;i<test;i++){
            int number=scanner.nextInt();
            int divideNumber=number;
            int count=0,digit;
            while (divideNumber>0){
                digit=divideNumber%10;
                //if digit zero it can't divide
                if (digit!=0) {
                    if (number % digit == 0)
                        count++;
                }
                divideNumber=divideNumber/10;
            }
            System.out.println(count);
        }
    }
}
