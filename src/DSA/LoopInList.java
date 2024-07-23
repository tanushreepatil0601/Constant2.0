package DSA;
class Node2{
    int data;
    Node next;
    Node2(int data){
        this.data=data;
        next = null;
    }
}
class LoopInList {
    Node head;
    LoopInList() {
        head = null;
    }
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
    boolean loopDeduct() {
        Node slow = head;
        Node fast = head;
        boolean flag = false;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    void DeleteAtHead() {
        if (head == null)
            return;
        head = head.next;
    }
    void printData(){
//        if(loopDeduct()==false) {
        Node last = head;
        while (last != null) {
            System.out.println(last.data);
            last = last.next;
        }
 }
    public static void main(String[] args) {
        LoopInList lj = new LoopInList();
        lj.insertAtEnd(6);
        lj.insertAtEnd(63);
        lj.insertAtEnd(67);
        lj.insertAtEnd(87);
        lj.DeleteAtHead();
        lj.DeleteAtHead();
        lj.printData();

    }
}
