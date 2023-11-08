import java.util.Arrays;

public class AscendingOrder {
   public static void main(String[] args) {
       int[] arr = {1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10};
       int target = 3;
       System.out.println(Arrays.toString(findStartEndPositions(arr, target)) + "\n");

       target = 11;
       System.out.println(Arrays.toString(findStartEndPositions(arr, target)) + "\n");
   }

   static int[] findStartEndPositions(int[] arr, int target) {
       int start = -1;
       int end = -1;

       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == target) {
               start = i;
               break;
           }
       }

       if (start != -1) {
           for (int i = arr.length - 1; i >= 0; i--) {
               if (arr[i] == target) {
                   end = i;
                   break;
               }
           }
       }

       return new int[]{start, end};
   }
}