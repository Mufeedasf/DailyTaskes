class Likes {

    public static void main(String[] args) {
        System.out.println(likeText(new String[]{}));
        System.out.println(likeText(new String[]{"Peter"}));
        System.out.println(likeText(new String[]{"Jacob", "Alex"}));
        System.out.println(likeText(new String[]{"Max", "John", "Mark"}));
        System.out.println(likeText(new String[]{"Alex", "Jacob", "Mark", "Max"}));
    }

    static String likeText(String[] names) {
        String text;
        switch (names.length) {
            case 0:
                text = "no one likes this";
                break;
            case 1:
                text = names[0] + " likes this";
                break;
            case 2:
                text = names[0] + " and " + names[1] + " like this";
                break;
            case 3:
                text = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;
            default:
                text = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
                break;
        }
        return text;
    }
}