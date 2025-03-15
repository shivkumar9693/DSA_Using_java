import java.util.Scanner;

public class LowerBound {
    // brute force approach
    // public static int lowerBound(int arr[], int x) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] >= x) {
    // return i;
    // }
    // }
    // return -1;
    // }
    // optimal approach
    public static int lowerBound(int arr[], int x, int n) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String args[]) {
        int x = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter element ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = lowerBound(arr, x, n);
        System.out.println(result);
    }
}
