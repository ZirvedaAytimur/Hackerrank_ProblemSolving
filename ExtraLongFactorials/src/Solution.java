import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    // BigInteger class is used for mathematical operation which involves very big integer calculations
    // that are outside the limit of all available primitive data types.
    static BigInteger factorial(int number){
        BigInteger fact=new BigInteger("1");

        for (int i=2;i<=number;i++)
            fact=fact.multiply(BigInteger.valueOf(i));

        return fact;
    }

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        int number=scanner.nextInt();

        System.out.println(factorial(number));
    }
}
