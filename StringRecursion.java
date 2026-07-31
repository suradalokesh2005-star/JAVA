public class StringRecursion {
    public static String reverseString(String text) {
        // BASE CASE: If string is empty or single character, it's already reversed
        if (text.isEmpty() || text.length() == 1) {
            return text;
        }

        // RECURSIVE CASE: Take the rest of the string, reverse it, then add the first letter to the back
        return reverseString(text.substring(1)) + text.charAt(0);
    }

    public static void main(String[] args) {
        String original = "hello";
        System.out.println("Reversed: " + reverseString(original)); // Output: olleh
    }
}
