import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int count=0,max=0;
        for(int i=0;i<topic.length;i++){

            for(int j=i+1;j<topic.length;j++){
                //çifter çifter grupları aldı
                char first[]=topic[i].toCharArray();
                char second[]=topic[j].toCharArray();

                int num=0;
                for(int y=0;y<first.length;y++){
                    int u=Character.getNumericValue(first[y]) ;
                    int uy =   Character.getNumericValue(second[y]);
                    boolean ch=false;
                    if(u==1 || uy==1)
                        ch=true;

                    if(ch==true){
                        num++;
                    }

                }
                if(num>max){
                    max=num;
                    count=1;
                }
                else if(max==num){
                    count++;
                }
            }
        }
        int r[]=new int[2];
        r[0]=max;
        r[1]=count;
        return r;

    }

    private static final Scanner scanner = new Scanner(System.in);

    //main fonksiyonu
    public static void main(String[] args) {
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            System.out.printf(String.valueOf(result[i]));

            if (i != result.length - 1) {
               System.out.printf("\n");
            }
        }
        scanner.close();
    }
}
