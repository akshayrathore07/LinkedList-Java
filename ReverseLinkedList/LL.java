package ReverseLinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LL {
    Node head;

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head=newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else {
            Node current = head;

            while (current.next!=null){
                current= current.next;
            }
            current.next=newNode;
        }
    }

    public void reverse(Node head){
        if (head==null){
            return;
        }
        reverse(head.next);
        System.out.print(head.data+" ");
    }

    public void display(){
        Node current = head;
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        System.out.println("Original list");
        ll.display();
        System.out.println("Reverse list");
        ll.reverse(ll.head);
    }
}
