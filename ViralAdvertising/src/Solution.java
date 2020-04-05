import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //number of days
        int numberOfDays=scanner.nextInt();
        int cumulative=0,shared=5,liked;
        for (int i=0;i<numberOfDays;i++){
            liked=shared/2;
            cumulative+=liked;
            shared=liked*3;
        }
        System.out.println(cumulative);
    }
}
