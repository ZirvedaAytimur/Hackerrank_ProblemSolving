import java.util.Scanner;

public class Solution {

    public static int pair(int[] arr,int n,int socks){
        int count=0,pairNumber=0;
        for (int i=0;i<n;i++){
            if (arr[i]==socks)
                count++;
        }
        if (count>1){
            pairNumber=count/2;
        }
        return pairNumber;
    }

    public static void main(String[] args) {

        int n,pairNumber=0;
        int array[];

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        array = new int [n];

        for (int i =0;i<array.length;i++)
        {
            array[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < array.length ; i++)
        {
            int flag = 0;
            for (int j = 0 ; j < i ; j++)
            {
                if (array[i] == array[j])
                {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
            {
                pairNumber+=pair(array,n,array[i]);
            }
        }

        System.out.println(pairNumber);
    }
}