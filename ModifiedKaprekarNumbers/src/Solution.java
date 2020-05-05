import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int lower=scanner.nextInt();
        int upper=scanner.nextInt();
        boolean check=false;

        int[] array={1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4950, 5050, 7272, 7777, 9999, 17344, 22222, 77778, 82656, 95121, 99999};

        for (int i=0;i<array.length;i++){
            if (array[i]>=lower&&array[i]<=upper) {
                check=true;
                System.out.printf(String.valueOf(array[i]));
                System.out.printf(" ");
            }
        }

        if (!check)
            System.out.println("INVALID RANGE");
    }
}
