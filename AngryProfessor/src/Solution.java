import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //number of test cases
        int t=scanner.nextInt();
        int arrivalTimes;

        for (int i=0;i<t;i++){
            //number of students
            int n=scanner.nextInt();
            //threshold number of students
            int k=scanner.nextInt();
            int count=0;

            for (int j=0;j<n;j++){
                arrivalTimes=scanner.nextInt();
                //if arrival time is equal or less than 0 increase count
                if (arrivalTimes<=0)
                    count++;
            }

            //if count is greater or equal threshold number of students class will not cancelled
            if (count>=k)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
