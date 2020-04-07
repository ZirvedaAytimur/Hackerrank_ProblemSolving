import java.util.Scanner;

public class Solution {

    static int search(int[] array,int size,int search){
        int findLoc=0;

        for (int i = 0; i < size; i++) {
            if (array[i] == search) {
                findLoc = i;
                break;
            }
        }
        return  findLoc;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //size of array
        int size=scanner.nextInt();
        //array
        int[] array=new int[size];

        int[] answer=new int[size];
        int firstValue;

        for (int i=0;i<size;i++)
            array[i]=scanner.nextInt();

        for (int i=1;i<=size;i++) {
            //first find where the i is
            firstValue=search(array,size,i);
            //then search for the location that we found where
            //we increase by because the question didn't begin with
            answer[i-1]=search(array,size,firstValue+1);
        }

        //we increase by because the question didn't begin with
        for (int i=0;i<size;i++)
            System.out.println(answer[i]+1);
    }
}
