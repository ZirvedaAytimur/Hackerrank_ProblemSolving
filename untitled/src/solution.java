import java.util.Scanner;

public class solution {
    public static void main(String[] args){
        int n,score,min,max,minCount=0,maxCount=0;

        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();

        score=scanner.nextInt();
        min=score;
        max=score;

        for (int i=1;i<n;i++){
            score=scanner.nextInt();
            if (score<min){
                min=score;
                minCount++;
            }
            if (score>max){
                max=score;
                maxCount++;
            }
        }

        System.out.println(maxCount+" "+minCount);
    }
}
