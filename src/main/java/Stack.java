public class Stack {
    private Node top; // Pointer to the top of the stack
    private int size; // Track the size of the stack

    public Stack() {
        top = null;
        size = 0; // Initialize the size to 0
    }

    // Method to push a node onto the stack
    public void push(Node node) {
        node.next = top; // Point the new node's next to the current top
        top = node; // Set the new node as the top of the stack
        size++; // Increment size
    }

    // Method to pop a node from the stack
    public Node pop() {
        if (top == null) {
            return null; // Stack is empty, nothing to pop
        }
        Node poppedNode = top;
        top = top.next; // Move top pointer to the next node
        size--; // Decrement size
        return poppedNode;
    }

    // Method to check the size of the stack
    public int size() {
        return size; // Return the current size of the stack
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
    
    public Node getTop() {
        return top;
    }

    
    
}
