import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    static long solve(long m, long w, long p, long n) {
        if (BigInteger.valueOf(m).multiply(BigInteger.valueOf(w)).compareTo(BigInteger.valueOf(n)) > 0) {
            return 1;
        }

        long minimumPass = Long.MAX_VALUE;
        long currentPass = 0;
        long production = 0;

        while (true) {
            long remain = divide(n - production, m * w);
            minimumPass = Math.min(minimumPass, currentPass + remain);

            if (remain == 1) {
                break;
            }

            if (production < p) {
                long extra = divide(p - production, m * w);

                currentPass += extra;
                production += extra * m * w;

                if (production >= n) {
                    minimumPass = Math.min(minimumPass, currentPass);

                    break;
                }
            }

            production -= p;

            if (m <= w) {
                m++;
            } else {
                w++;
            }
        }

        return minimumPass;
    }

    static long divide(long a, long b) {
        return a / b + (a % b == 0 ? 0 : 1);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long m = in.nextLong();
        long w = in.nextLong();
        long p = in.nextLong();
        long n = in.nextLong();

        System.out.println(solve(m, w, p, n));
    }
}
