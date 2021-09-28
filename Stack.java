import java.util.Stack;

class Stack {
    public static void main(String[] args) {
        Stack<String> os= new Stack<>();

        // Adding elements to the OS Stack
        os.push("Debian");
        os.push("Parrot");
        os.push("Arch");
        System.out.println("OS Stack: " + os);

        // Accessing an element from the top
        String element = os.peek();
        System.out.println("Element at top: " + element);

        // Searching for an element
        int position = os.search("Parrot");
        System.out.println("Position of Parrot: " + position);


        // Checking if the stack is empty
        boolean result = os.empty();
        System.out.println("Is the stack empty? " + result);

    }
}
