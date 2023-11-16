public class StringRotation {

    public static void main(String[] args) {
        String str1 = "ABAC";
        String str2 = "CABA";
        System.out.println(isRotation(str1, str2));
    }

    public static boolean isRotation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        String concat = str1 + str1;
        return concat.contains(str2);
    }
}