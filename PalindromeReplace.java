
public class PalindromeReplace {
    public static void main(String[] args) {
        String input = "bob has a radar plane";
        System.out.println("Original String: " + input);

        // Initialize a StringBuilder with the input string
        StringBuilder result = new StringBuilder(input);
        int length = input.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 2; j <= length; j++) {
                String substring = input.substring(i, j);
                boolean isPalindrome = true;
                int left = 0;
                int right = substring.length() - 1;

                while (left < right) {
                    if (substring.charAt(left) != substring.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isPalindrome) {
                    String replacement = "*".repeat(substring.length());
                    result.replace(i, j, replacement);
                    // Update input to reflect the changes in result
                    input = result.toString();
                }
            }
        }

        System.out.println("Modified String: " + result.toString());
    }
}
