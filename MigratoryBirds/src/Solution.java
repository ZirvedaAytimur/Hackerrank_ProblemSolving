import java.util.Scanner;

public class Solution {

    public static int frequencies(int[] arr,int n,int type){
        int count=0;
        for (int i=0;i<n;i++){
            if (arr[i]==type)
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n,number,max=0,size,selectedType=0;
        n=scanner.nextInt();

        int[] arr=new int[n];

        for (int i=0;i<n;i++){
            number=scanner.nextInt();
            arr[i]=number;
        }

        for (int j=1;j<=6;j++){
            size=frequencies(arr,n,j);
            if (size>max) {
                max = size;
                selectedType=j;
            }
        }

        System.out.println(selectedType);
    }
}
