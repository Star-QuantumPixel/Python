import java.util.Stack;

public class StackPeekExample {

    // Method to peek at the top element of the stack
    public static Integer peek(Stack<Integer> stack) {
        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
            return null; // Return null if the stack is empty
        }
        // Return the top element of the stack without removing it
        return stack.peek();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push some elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Call peek() method to get the top element without removing it
        Integer topElement = peek(stack);

        if (topElement != null) {
            System.out.println("Top element (peeked): " + topElement);
        }

        // Checking the stack after calling peek()
        System.out.println("Stack after peek(): " + stack);
    }
}
