
/**
 * Author: Nicholas Bleeker
 * Project: Linked List Implementation (Singly Linked List)
 * Description: The Node used to test the functionality of the LinkedList class
 */
public class Node {

    public String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public Node getNextNode() {
        return this.next;
    }
}
