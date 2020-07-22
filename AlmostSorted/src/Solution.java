import java.util.*;

public class Solution {

    static String almostSorted(int[] arr, int n) {
        int left = 0;
        int right = n - 1;

        while(left < right && arr[left] <= arr[left+1]){
            ++left;
        }

        if(left == right){
            return "yes";
        }

        while(right > left && arr[right] >= arr[right-1]){
            --right;
        }

        if((left > 0 && arr[right] < arr[left-1]) || (right < n-1 && arr[left] > arr[right+1])){
            return "no";
        }

        int medium;
        for(medium = left+1; medium < right && arr[medium] >= arr[medium+1]; ++medium){}
        if(medium == right){
            return "yes\n" + ((right-left < 2) ? "swap " : "reverse ") + (left+1) + " " + (right+1);
        }

        if(medium-left > 1 || arr[left] < arr[right-1] || arr[right] > arr[left+1]){
            return "no";
        }

        for(int k = right-1; medium < k && arr[medium] <= arr[medium+1]; ++medium){}
        return (right-medium > 1) ? "no" : "yes\nswap " + (left+1) + " " + (right+1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(almostSorted(arr, n));

        scanner.close();
    }
}
