package tdd.linkedlist;

public class DoublyLinkedList {
    DoublyNode head;

    public DoublyLinkedList(){
        this.head = null;
    }

    public void insert(int data){
        DoublyNode anotherNode = new DoublyNode(data);
        if(head == null){
            head = anotherNode;
        }else {
            anotherNode.next = head;
            head.prev = anotherNode;
            head = anotherNode;
        }
    }

    public void display(){
        DoublyNode current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
