/**
 *  Author: Nicholas Bleeker
 *  Project: Doubly Linked List Implementaion
 *  Description: The main file used to test the functionalality of the DoublyLinkedList class
 */
public class Main {
    public static void main(String[] args) {
    DoublyLinkedList line = new DoublyLinkedList();
    // Line of 3 people
    line.addToHead("James");
    line.addToTail("Charlie");
    line.addToTail("Frank");
    line.printList();
    // James was holding his friend Sam's place in line
    line.addToHead("Sam");
    line.printList();
    // Charlie and Frank see this and decides to leave the line out of frustration
    line.removeByData("Charlie");
    line.removeTail();
    line.printList();
    }
}