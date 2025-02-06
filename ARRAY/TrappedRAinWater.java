public class TrappedRAinWater {
    public static int TrappedWater(int height[]) {
        // leftMax-Array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // rightMax-array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop
        int TrappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterlavel = Math.min(leftMax[i], rightMax[i]);
            TrappedWater += waterlavel - height[i];
        }
        return TrappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrappedWater(height));
    }
}
