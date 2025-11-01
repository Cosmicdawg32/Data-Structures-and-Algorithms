/**
 * Author: Nicholas Bleeker
 * Project: Linked List Implementaion (Singly Linked List)
 * Description: A basic implementation of a singly linked list with the functions:
 *      - addToHead(String data)
 *      - addToTail(String data)
 *      - removeHead()
 *      - printList()
 */
public class LinkedList {
    
    public Node head;
    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;

        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data) {
        Node tail = this.head;
        if (tail == null) { // if there is no head
            this.head = new Node(data); //sets the new Node as the head
        } else {    // if there is a head
            while (tail.getNextNode() != null) { // iterates through the list
                tail = tail.getNextNode();  
            }
            tail.setNextNode(new Node(data));   // sets the new Node as the tail
        }
    }

    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) { // returns null if the list is empty
            return null;
        }

        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    public String printList() {
        StringBuilder sb = new StringBuilder();
        sb.append("<head>");
        Node currentNode = this.head;

        while (currentNode != null) {
            sb.append(currentNode.data + " ");
            currentNode = currentNode.getNextNode();
        }
        sb.append("<tail>");
        String output = sb.toString();
        System.out.println(output);
        return output;
    }
}
