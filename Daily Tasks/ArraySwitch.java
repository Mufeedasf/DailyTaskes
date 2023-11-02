class ArraySwitch {
 public static void main(String[] args) {
        int seq[] = {1, 2, 3, 4, 5};
        int c = seq.length;
        int m = 2;
        rotateArray(seq, c, m);
        printArray(seq,c);
    }

    static void rotateArray(int seq[], int c, int m) {
        reverseArray(seq, 0, c - 1);
        reverseArray(seq, 0, m - 1);
        reverseArray(seq, m, c - 1);
    }

    static void reverseArray(int seq[], int start, int end) {
        while (start < end) {
            int temp = seq[start];
            seq[start] = seq[end];
            seq[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int seq[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(seq[i] + " ");
        System.out.println();
    }
}