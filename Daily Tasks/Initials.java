class Initials {
    public static void main(String[] args) 
	{
        String fullName = "Mufeeda S F"; // Replace with your full name
        String[] names = fullName.split(" ");
        StringBuilder initials = new StringBuilder();

        for (String name : names) {
            initials.append(name.charAt(0));
        }

        System.out.println("Initials: " + initials.toString().toUpperCase());
    }
}