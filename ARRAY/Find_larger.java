class Find_larger {
    public static int findlarger(int numbers[]) {
        int larger = Integer.MIN_VALUE;
        // for smaller
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (larger < numbers[i]) {
                larger = numbers[i];
            }
            if (small > numbers[i]) {
                small = numbers[i];
            }
        }
        System.out.println("Smaller numer is " + small);
        return larger;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 10, 8 };
        int result = findlarger(numbers);
        System.out.println("larger number is " + result);
    }
}