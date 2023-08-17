package ReverseLinkedListUsingRecursion;

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

    public Node reverse(Node head){
       if (head.next==null){
           return head;
       }
       Node newHead = reverse(head.next);
       head.next.next=head;
       head.next=null;
       return newHead;
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

        Node rev = ll.reverse(ll.head);

        System.out.println("Reversed list");  // Corrected output message
        ll.head = rev;  // Update the head of the linked list with the reversed head
        ll.display();   // Display the reversed linked list
    }
}
