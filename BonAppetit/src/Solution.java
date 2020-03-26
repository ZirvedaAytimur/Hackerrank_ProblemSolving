import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n,k,b,sum=0,price,amount;

        n=scanner.nextInt();
        k=scanner.nextInt();

        int[] bill=new int[n];

        for (int i=0;i<n;i++){
            price=scanner.nextInt();
            bill[i]=price;
            sum+=price;
        }

        b=scanner.nextInt();

        amount=b-(sum-bill[k])/2;
        if (amount!=0){
            System.out.println(amount);
        } else System.out.println("Bon Appetit");
    }
}
