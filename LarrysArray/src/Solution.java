import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i=0;i<test;i++) {
            int numbers=scanner.nextInt();
            int[] arrayNumbs=new int[numbers];
            for (int y=0;y<numbers;y++) {
                arrayNumbs[y]=scanner.nextInt();
            }

            int matches=1;
            while(matches>0) {
                int action=0;
                for (int y=0;y<(numbers-2);y++) {
                    int smallestNumber=Integer.MAX_VALUE;
                    if ( arrayNumbs[y]<arrayNumbs[y+1] ) {
                        smallestNumber=arrayNumbs[y];
                    } else {
                        smallestNumber=arrayNumbs[y+1];
                    }

                    if ( smallestNumber>arrayNumbs[y+2] ) {
                        smallestNumber=arrayNumbs[y+2];
                    }

                    int firstNumber=arrayNumbs[y];
                    int secondNumber=arrayNumbs[y+1];
                    int thirdNumber=arrayNumbs[y+2];

                    if (smallestNumber==arrayNumbs[y+1]) {
                        action++;
                        arrayNumbs[y]=secondNumber;
                        arrayNumbs[y+1]=thirdNumber;
                        arrayNumbs[y+2]=firstNumber;

                    } else if (smallestNumber==arrayNumbs[y+2]) {
                        action++;
                        arrayNumbs[y]=thirdNumber;
                        arrayNumbs[y+1]=firstNumber;
                        arrayNumbs[y+2]=secondNumber;
                    }
                }
                matches=action;
            }

            if ( arrayNumbs[arrayNumbs.length-1]>arrayNumbs[arrayNumbs.length-2] ) {
                System.out.print("YES\n");
            } else {
                System.out.print("NO\n");
            }
        }

    }
}