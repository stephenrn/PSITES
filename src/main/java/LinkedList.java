public class LinkedList {
    Node head; // Head of the linked list

    // Method to add a node at the end of the list
    public void addNode(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Method to clear the linked list
    public void clear() {
        head = null;
    }
    
    public int size() {
        int size = 0;
        Node currentNode = head; // Start from the head of the list

        // Traverse through the linked list
        while (currentNode != null) {
            size++; // Increment the size for each node
            currentNode = currentNode.next; // Move to the next node
        }
        return size; // Return the total number of nodes
    }

}
