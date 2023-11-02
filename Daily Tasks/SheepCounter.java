class SheepCounter {
    static int countSheep(boolean[] sheepArray) {
        int count = 0;
        for (boolean sheep : sheepArray) {
            if (sheep) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        boolean[] sheepArray = {true, true, true, false, true, true, true, true, true, false, true, false, true, false, false, true, true, true, true, false, false, true, true};
        int sheepCount = countSheep(sheepArray);
        System.out.println("Number of sheep present: " + sheepCount);
    }
}