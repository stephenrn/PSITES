public class SuggestedNode {
    String name;
    String suggestion;
    String time; // Field for timestamp
    SuggestedNode next;

    public SuggestedNode(String name, String suggestion, String time) {
        this.name = name;
        this.suggestion = suggestion;
        this.time = time;
    }
}
