public class Queue {
    Node front;
    Node rear;
    int size;  // Maintain the size of the queue

    public Queue() {
        front = rear = null;
        size = 0;
    }

    // Method to enqueue data
    public void enqueue(String name, String yearLevel, String course, String contact, String regForm, String membershipForm) {
        Node newNode = new Node(name, yearLevel, course, contact, regForm, membershipForm);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;  // Increment size when a new node is added
        System.out.println("Enqueued: " + name + " - Queue size: " + size);
    }


    // Method to dequeue (remove) the front node
    public Node dequeue() {
        if (front != null) {
            Node temp = front;
            front = front.next;
            size--;
            if (front == null) {
                rear = null;
            }
            return temp;
        } else {
            return null;
        }
    }



    // Method to get the size of the queue
    public int size() {
        return size;
    }

    // Method to retrieve the front node without removing it (for viewing)
    public Node front() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return null;
        }
        return front;
    }
}
