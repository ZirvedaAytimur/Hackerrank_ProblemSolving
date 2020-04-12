import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int location=0,count=0;

        int[] c=new int[n];
        for (int i=0;i<n;i++)
            c[i]=scanner.nextInt();

        //son atlayışa gelene kadar
        while (location<(n-3)){
            //2 önündeki 0 sa ona atla
            if (c[location+2]==0){
                count++;
                location+=2;
            }else {
                count++;
                location++;
            }
        }

        //son atlayış
        count++;

        System.out.println(count);
    }
}
