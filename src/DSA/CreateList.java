package DSA;
public class CreateList {
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head;
    CreateList() {
        head = null;
    }
    int MiddleElement(){
        Node slow=head,fast=head;

        while (slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    boolean DetectLoop(){
        Node slow=head,fast=head;
        boolean flag=false;
        while (slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow.next==fast.next){
                flag=true;
                break;
            }
        }
        return flag;
    }
    void insertAtTheEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next!=null) {
            last = last.next;
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
        CreateList  lj = new CreateList ();
        lj.insertAtTheEnd(10);
        lj.insertAtTheEnd(20);
        lj.insertAtTheEnd(30);
        lj.insertAtTheEnd(40);
        lj.insertAtTheEnd(50);

        Node adr=lj.head.next.next;
        adr.next=lj.head.next;

        boolean loopCheck=lj.DetectLoop();
        System.out.println(loopCheck);

    }
}








