import java.util.Stack;

public class ReverseStringUsingStack {

    public static String reverseString(String str) {
        // Create a stack to hold characters
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string into the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Create a StringBuilder to hold the reversed string
        StringBuilder reversedString = new StringBuilder();

        // Pop all characters from the stack and append to the StringBuilder
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        // Return the reversed string
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
