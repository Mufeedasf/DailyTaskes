public class RotateArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(array, k);

        // Print the rotated array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than the array length

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}