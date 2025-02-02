import java.util.Scanner;

public class Binear_search {
    public static int Search(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 7, 8 };
        System.out.println("Enter your key ");
        Scanner s = new Scanner(System.in);
        int key = s.nextInt();

        int result = Search(number, key);
        if (result == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("key at index " + result);
        }
    }
}
