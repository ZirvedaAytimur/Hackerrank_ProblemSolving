import java.util.Scanner;

public class deneme {

    static boolean checkingA(int n, int k, int[] a){
        boolean check=true;
        for (int l=0;l<n;l++){
            if (k%a[l]!=0) {
                check = false;
                break;
            }
        }
        return check;
    }

    static boolean checkingB(int k,int m,int b[]){
        boolean check=true;
        for (int h=0;h<m;h++){
            if (b[h]%k!=0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,m,number,min=2147483647,max=0,counter=0;
        boolean checkA,checkB;
        n=scanner.nextInt();
        m=scanner.nextInt();

        int[] a=new int[n];
        int[] b=new int[m];

        for (int i=0;i<n;i++){
            number=scanner.nextInt();
            a[i]=number;
            if (max<number)
                max=number;
        }

        for (int j=0;j<m;j++){
            number=scanner.nextInt();
            b[j]=number;
            if (min>number)
                min=number;
        }

        for (int k=max;k<=min;k++){
            checkA=checkingA(n,k,a);
            if (checkA){
                checkB=checkingB(k,m,b);
                if (checkB)
                    counter++;
            }
        }

        System.out.println(counter);
    }
}