import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter two strings
        System.out.println("Enter the first string:");
        String a = in.nextLine();

        System.out.println("Enter the second string:");
        String b = in.nextLine();

        // Check if the strings are anagrams
        boolean result = areAnagrams(a, b);

        // Display the result
        System.out.println("The strings are " + (result ? "anagrams." : "not anagrams."));

        in.close();
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String a, String b) {
        // Remove any spaces and convert strings to lower case
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different
        if (a.length() != b.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
