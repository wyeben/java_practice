package tdd.linkedlist;

public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public void insert(int data){
        Node anotherNode = new Node(data);
        anotherNode.next = head;
        head = anotherNode;
    }

    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
