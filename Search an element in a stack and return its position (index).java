import java.util.Stack;

public class SearchElementInStack {

    public static int searchElement(Stack<Integer> stack, int element) {
        // Create a temporary stack to avoid modifying the original stack
        Stack<Integer> tempStack = new Stack<>();
        int position = 1; // 1-based index for position

        // Search the element by popping each element from the stack
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current == element) {
                // Restore the stack by pushing elements back to the tempStack
                while (!tempStack.isEmpty()) {
                    stack.push(tempStack.pop());
                }
                return position; // Found the element, return its position
            }
            // Push the current element to tempStack for restoring later
            tempStack.push(current);
            position++;
        }

        // Restore the stack if the element was not found
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        // If the element is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int elementToSearch = 30;
        int position = searchElement(stack, elementToSearch);

        if (position != -1) {
            System.out.println("Element " + elementToSearch + " found at position: " + position);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the stack.");
        }
    }
}
