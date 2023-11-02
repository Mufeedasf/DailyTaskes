class Task
{
 static int frequency(int[] array, int element) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                count++;
            }
        }
        return count;
    }

}