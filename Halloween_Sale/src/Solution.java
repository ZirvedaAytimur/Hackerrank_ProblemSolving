import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int p=scanner.nextInt();
        int d=scanner.nextInt();
        int m=scanner.nextInt();
        int s=scanner.nextInt();

        int count=0;

        while (s>0){
            if (count==0){
                s-=p;
            }
            else {
                if (p > m) {
                    p -= d;
                    if (p<=m)
                        p=m;
                } else p = m;
                s-=p;
            }
            if (s<0)
                break;
            count++;
        }

        System.out.println(count);
    }
}
