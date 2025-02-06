public class MaxSubArray {
    public static int MaxSub(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k < j; k++) {
                    curr += numbers[k];
                }
                if (max < curr) {
                    max = curr;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        System.out.println(MaxSub(numbers));
    }
}
