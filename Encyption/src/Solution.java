import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String s=scanner.nextLine();

        double length=Math.sqrt(s.length());
        int row,column;

        if (Math.floor(length)*Math.ceil(length)>=s.length()) {
            row = (int) Math.floor(length);
            column= (int) Math.ceil(length);
        } else {
            row= (int) Math.ceil(length);
            column= (int) Math.ceil(length);
        }

        for (int i=0;i<column;i++){
            int currentIndex=i;
            for (int j=0;j<row;j++){
                if (currentIndex<=s.length()-1)
                    System.out.print(s.charAt(currentIndex));
                currentIndex+=column;
            }
            if (i+1!=column)
                System.out.print(" ");
        }
    }
}
