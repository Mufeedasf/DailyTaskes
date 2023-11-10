class Rotation {

    public static void main(String[] args) {

        String str1 = "AACD";
        String str2 = "ACDA";

        System.out.println(isRotation(str1, str2));
    }

    static boolean isRotation(String str1, String str2) {

        // Length of both strings should be same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a temp string for str1 and append the temp string to str1
        String temp = str1.substring(0, str1.length() - 1);
        str1 = str1 + temp;

        // Now, check if the str2 is a substring of str1
        return (str1.indexOf(str2) != -1);
    }
}