import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //The starting day
        int startingDay=scanner.nextInt();
        //The ending day
        int endingDay=scanner.nextInt();
        //the divisor
        int divisor=scanner.nextInt();
        //counter
        int count=0;

        for (int i=startingDay;i<=endingDay;i++){
            int day=i;
            int reverse=0,difference;
            //find the reverse
            while (day!=0){
                reverse=10*reverse+day%10;
                day/=10;
            }
             //if difference can divide divisor evenly it is a beaut,ful day
            difference=Math.abs(i-reverse);
            if (difference%divisor==0)
                count++;
        }
        System.out.println(count);
    }
}
