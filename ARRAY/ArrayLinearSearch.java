public class ArrayLinearSearch {
    // Linear search function
    public static int Search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int key = 6;
        int result = Search(arr, key);
        if (result == -1) {
            System.out.println("Index not fount");
        } else {
            System.out.println("Index found at " + result);
        }
    }
}
