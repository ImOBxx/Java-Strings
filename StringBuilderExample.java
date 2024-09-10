public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a new StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string to the StringBuilder
        sb.append(" World");
        System.out.println(sb.toString());  // Output: Hello World

        // Insert a string at a specified position
        sb.insert(6, "Beautiful ");
        System.out.println(sb.toString());  // Output: Hello Beautiful World

        // Delete a substring
        sb.delete(6, 16);
        System.out.println(sb.toString());  // Output: Hello World

        // Reverse the string
        sb.reverse();
        System.out.println(sb.toString());  // Output: dlroW olleH

        // Convert StringBuilder to String
        String finalString = sb.toString();
        System.out.println(finalString);  // Output: dlroW olleH
    }
}
