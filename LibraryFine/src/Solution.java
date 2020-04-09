import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int d1=scanner.nextInt();
        int m1=scanner.nextInt();
        int y1=scanner.nextInt();

        int d2=scanner.nextInt();
        int m2=scanner.nextInt();
        int y2=scanner.nextInt();

        int fine;

        if (y1<y2){
            fine=0;
        } else if (y1>y2)
            fine=10000*(y1-y2);
        else {
            if (m1<m2)
                fine=0;
            else if (m1>m2)
                fine=500*(m1-m2);
            else {
                if (d1<=d2)
                    fine=0;
                else fine=15*(d1-d2);
            }
        }

        System.out.println(fine);
    }
}
