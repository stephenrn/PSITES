public class SuggestedStack {
    SuggestedNode top;

    // Constructor
    public SuggestedStack() {
        top = null;
    }

    // Push method
    public void push(SuggestedNode newNode) {
        newNode.next = top;  // Point newNode to the current top
        top = newNode;  // Set newNode as the new top of the stack
    }

    // Getter for top node
    public SuggestedNode getTop() {
        return top;
    }
}
