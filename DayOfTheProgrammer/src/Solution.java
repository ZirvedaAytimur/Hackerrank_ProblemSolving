import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int year;
        year=scanner.nextInt();

        if (year<1919){
            if(year==1918)
                System.out.println("26.09."+year);
            else if (year%4==0)
                System.out.println("12.09."+year);
            else System.out.println("13.09."+year);
        } else if (year%4==0&&year%100!=0)
            System.out.println("12.09."+year);
        else if (year%4==0&&year%100==0&&year%400==0)
            System.out.println("12.09." + year);
        else System.out.println("13.09." + year);
    }
}
