// Node class to store applicant data
public class Node {
    String name, yearLevel, course, contact;
    String regFormPath, membershipFormPath; // Paths to uploaded images
    Node next;

    // Constructor to initialize the node
    public Node(String name, String yearLevel, String course, String contact, 
                String regFormPath, String membershipFormPath) {
        this.name = name;
        this.yearLevel = yearLevel;
        this.course = course;
        this.contact = contact;
        this.regFormPath = regFormPath;
        this.membershipFormPath = membershipFormPath;
        this.next = null;
    }
}
