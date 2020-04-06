import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //size of array
        int size=scanner.nextInt();
        //rotation count
        //mod rotation count because every size rotation it receive the same array
        int rotCount=scanner.nextInt()%size;
        //number of queries
        int questionNumber=scanner.nextInt();

        //to keep the last element
        int last;

        int[] array=new int[size];
        for (int i=0;i<size;i++)
            array[i]=scanner.nextInt();

        //rotate array
        for (int i=0;i<rotCount;i++){
            //it is a right notation so we have to start end of the array
            last=array[array.length-1];
            for (int j=array.length-1;j>0;j--){
                array[j]=array[j-1];
            }
            array[0]=last;
        }

        for (int i=0;i<questionNumber;i++) {
            int question=scanner.nextInt();
            System.out.println(array[question]);
        }
    }
}
