import java.util.Scanner;

public class Bubble {
    public static void BubbleSort(int arr[], int n) {
        for (int i = n - 1; i > 0; i--) {
            int disSwap = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    disSwap = 1;
                }
            }
            if (disSwap == 0) {
                break;
            }
            System.out.println("run");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
