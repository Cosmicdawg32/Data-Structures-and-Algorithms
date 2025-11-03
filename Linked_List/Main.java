/**
 * Author: Nicholas Bleeker
 * Project: Linked List Implementaion (Singly Linked List)
 * Description: The main file used to test the functionalality of the LinkedList class
 */
public class Main {
    public static void main(String[] args) {
        // Prints each day of the week
        LinkedList days = new LinkedList();
        days.printList();
        days.addToHead("Wednesday");
        days.printList();
        days.addToHead("Tuesday");
        days.printList();
        days.addToHead("Monday");
        days.printList();
        days.addToTail("Thursday");
        days.printList();
        days.addToTail("Friday");
        days.printList();
        days.addToHead("Sunday");
        days.printList();
        days.addToTail("Saturday");
        days.printList();
        days.addToHead("Chewsday");
        days.printList();
        days.removeHead();
        days.printList();
    }
}
