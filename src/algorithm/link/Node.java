package algorithm.link;

public class Node {
    public String value;
    public Node next;

    public Node(String value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
