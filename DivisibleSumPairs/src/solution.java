import java.util.Scanner;

public class solution {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n,k,number,count=0,sum;

        n=scanner.nextInt();
        k=scanner.nextInt();

        int[] ar=new int[n];

        for (int i=0;i<n;i++){
            number=scanner.nextInt();
            ar[i]=number;
        }

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                sum=ar[i]+ar[j];
                if (sum%k==0){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
