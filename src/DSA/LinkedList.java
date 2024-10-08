package DSA;

class Node {
    int data;
    Node next;

    Node(int data){
    this.data=data;
    next=null;
    }
}
public class LinkedList {
    Node head;
    LinkedList() {
        head = null;
    }
    void insertAtTheEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while
        (last.next!=null) {
            last = last.next;
            // to increment we use i++ but in linked list we use "last=last.next"
        }
        last.next = newNode;
    }
    void printData() {
            Node last = head;
        while (last != null) {
            System.out.println(last.data);
            last = last.next;
        }
    }
    public static void main(String[] args) {
        LinkedList lj = new LinkedList();
        lj.insertAtTheEnd(10);
        lj.insertAtTheEnd(20);
        lj.insertAtTheEnd(30);
        lj.insertAtTheEnd(40);
        lj.insertAtTheEnd(50);
        lj.printData();
    }
}