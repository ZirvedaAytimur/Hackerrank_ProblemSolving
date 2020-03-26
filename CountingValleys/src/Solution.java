import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n,path=0,count=0;
        n=scanner.nextInt(); scanner.nextLine();

        String s=scanner.nextLine();

        for (int i=0;i<n;i++){
            char character=s.charAt(i);
            if (character=='U')
                path++;
            else{
                if (path==0){
                    path--;
                    count++;
                }
                else path--;
            }
        }

        System.out.println(count);
    }
}
