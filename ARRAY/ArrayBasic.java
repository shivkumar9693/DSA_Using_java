public class ArrayBasic {
    // for updating value of array
    public static void updateArray(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1; // it update the value of main function also
        }
    }

    public static void main(String[] args) {
        int marks[] = { 10, 20, 30, 40, 50 };
        // calling update function
        updateArray(marks);
        // print
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}