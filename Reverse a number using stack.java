import java.util.Stack;

public class ReverseNumberUsingStack {

    public static int reverseNumber(int num) {
        // Create a stack to hold digits
        Stack<Integer> stack = new Stack<>();

        // Extract digits and push them into the stack
        while (num > 0) {
            stack.push(num % 10);
            num /= 10;
        }

        // Initialize the reversed number
        int reversedNum = 0;
        int place = 1;

        // Pop digits from the stack and build the reversed number
        while (!stack.isEmpty()) {
            reversedNum += stack.pop() * place;
            place *= 10;
        }

        return reversedNum;
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverseNumber(number);

        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);
    }
}
