import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //number of chapters
        int n=scanner.nextInt();
        //limit
        int k=scanner.nextInt();
        int pageNumber = 1;
        int specialProblems = 0;

        for(int i = 0; i < n; i++)
        {
            int problems = scanner.nextInt();
            int currentProblem = 1;

            while(problems > 0)
            {
                int pageProblems = problems;
                pageProblems -= k;

                if(pageProblems > 0)
                {pageProblems = k;}
                else
                {pageProblems += k;}

                while(pageProblems > 0)
                {
                    if(pageNumber == currentProblem)
                    {
                        specialProblems++;
                    }
                    currentProblem++;
                    pageProblems--;
                }

                problems -= k;
                pageNumber++;
            }
        }
        System.out.println(specialProblems);
    }
}
