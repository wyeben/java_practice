package tdd.linkedlist;


public class Main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(15);
        list.insert(5);
        list.insert(25);

        System.out.println("Singly Linked List:");
        list.display();

        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.insert(23);
        list2.insert(14);
        list2.insert(12);

        System.out.println("Double Linked List:");
        list2.display();
    }
}
