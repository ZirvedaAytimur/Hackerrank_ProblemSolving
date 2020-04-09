import java.util.Scanner;

public class Solution {

    static int findMin(int[] array){
        int min=Integer.MAX_VALUE;

        for (int i=0;i<array.length;i++) {
            if (array[i] != 0 && array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int size=scanner.nextInt();

        int[] array=new int[size];
        for (int i=0;i<size;i++)
            array[i]=scanner.nextInt();

        int sticksCut=array.length;
        System.out.println(sticksCut);
        while (sticksCut!=0){
            int lengthOfCut=findMin(array);
            for (int i=0;i<size;i++){
                if (array[i]!=0) {
                    array[i] -= lengthOfCut;
                    if (array[i]==0)
                        sticksCut--;
                }
            }
            if (sticksCut!=0)
                System.out.println(sticksCut);
        }
    }
}
