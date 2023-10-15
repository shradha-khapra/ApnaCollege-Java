public class linkedlist {
    Node head;
    int size;
    linkedlist(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node (String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // add-first
    public void addFirst(String data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    // add-last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currentnode = head;
        while(currentnode.next!=null){
            currentnode = currentnode.next;
        }
        currentnode.next = newNode;
    }
    // print
    public void printLinkedList(){
        if(head==null){
            System.out.println("empty linked list");
            return;
        }
        Node currentnode = head;
        while(currentnode!=null){
            System.out.print(currentnode.data + "-->");
            currentnode = currentnode.next;
        }
        System.out.println(" null");
    }
    //delete first
    public void deletefirst(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        head = head.next;
        size--;
    }
    //delete last
    public void deletelast(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        if(head.next==null){
            head=null;
        }
        Node last = head.next;
        Node secondlast = head;
        while(last.next!=null){
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
        size--;
    }
    public void iterateList(){
        if(head==null || head.next==null){
            return;
        }
        Node prevnode = head;
        Node currentnode = head.next;
        while(currentnode != null){
            Node nextnode = currentnode.next;
            currentnode.next = prevnode;

            prevnode = currentnode;
            currentnode = nextnode;
        }
        head.next=null;
        head = prevnode;
    }
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newhead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newhead;
    }
    public static void main(String[] args){
        linkedlist ll = new linkedlist();
        ll.addFirst("c ");
        ll.addFirst(" b ");
        ll.addFirst(" a ");
        ll.printLinkedList();

        ll.addLast(" is ");
        ll.addLast(" char's ");
        ll.addLast(" in ");
        ll.addLast(" alphabets ");
        ll.printLinkedList();

        ll.deletefirst();
        ll.printLinkedList();

        ll.deletelast();
        ll.printLinkedList();

        System.out.println(ll.size);

        ll.addFirst("a");
        ll.addLast("alphabets");
        System.out.println(ll.size);

        ll.iterateList();
        ll.printLinkedList();

        ll.head = ll.reverseRecursive(ll.head);
        ll.printLinkedList();
    }
}
