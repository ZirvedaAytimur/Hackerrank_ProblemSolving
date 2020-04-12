import java.util.Arrays;
import java.util.Scanner;

class Test {

    // Returns maximum size of subset with no pair
    // sum divisible by K
    static int subsetPairNotDivisibleByK(int arr[],
                                         int N, int K)
    {

        // Array for storing frequency of modulo
        // values
        int f[] = new int[K];
        Arrays.fill(f, 0);

        // Fill frequency array with values modulo K
        for (int i = 0; i < N; i++) {
            f[arr[i] % K]++; //sayının modlarına göre kaç tane eleman var buluyor
        }

        // if K is even, then update f[K/2]
        if (K % 2 == 0)
            f[K/2] = Math.min(f[K/2], 1);

        // Initialize result by minimum of 1 or
        // count of numbers giving remainder 0
        int res = Math.min(f[0], 1);

        // Choose maximum of count of numbers
        // giving remainder i or K-i
        for (int i = 1; i <= K/2; i++)
            res += Math.max(f[i], f[K-i]);

        return res;
    }

    // Driver method
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        int N=scanner.nextInt();
        int K=scanner.nextInt();

        int[] arr=new int[N];

        for (int i=0;i<N;i++)
            arr[i]=scanner.nextInt();

        System.out.print(subsetPairNotDivisibleByK(
                arr, N, K));
    }
}