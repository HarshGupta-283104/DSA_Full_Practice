public class StringMethod {
    public static void main(String[] args) {
        String name = "Harsh";
        int length = name.length();
        System.out.println(length);

        System.out.println("Now I will check toLowerCase toUpperCase Method.");

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println("I will use here trim method.");
        String NonTrimString = "         Harsh      ";

        System.out.println(NonTrimString.trim());
    }
}
