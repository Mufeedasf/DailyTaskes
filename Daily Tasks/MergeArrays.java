public class MergeArrays {

   public static void main(String[] args) {

       int[] array1 = {1, 2, 3, 4, 5};
       int[] array2 = {6, 7, 8, 9, 10};

       mergeArrays(array1, array2);
   }

   public static void mergeArrays(int[] array1, int[] array2) {

       int[] mergedArray = new int[array1.length + array2.length];

       System.arraycopy(array1, 0, mergedArray, 0, array1.length);
       System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

       for (int i = 0; i < mergedArray.length; i++) {
           System.out.print(mergedArray[i] + " ");
       }
   }
}