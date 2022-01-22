package Amazon.Day10;

public class LinkedList {

    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public Node getHead(){
        return head;
    }

    public Node getTail(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
    }

    public void insertAtHead(int data){
        Node list = new Node(data);
        list.next = null;
        if(head == null){
            head = list;
        }
        else{
            Node temp = list;
            temp.next = head;
            head = temp;
        }
    }

    public void insertAtTail(int data){
        Node list = new Node(data);
        list.next = null;
        if(head == null){
            head = list;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = list;
        }
    }

    public int deleteAtHead(Node head){
        if(head == null){
            return 0;
        }
        else{
            int k = head.data;
            head = head.next;
            return k;
        }
    }

    public int deleteAtTail(Node head){
        if(head == null){
            return 0;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            int k = temp.data;
            temp = null;
            return k;
        }
    }

    public int deleteAtIndex(Node head, int index){
        if(head == null){
            return 0;
        }
        else{
            int k = head.data;
            head = head.next;
            return k;
        }
    }

    public void display(Node head){
        if(head == null){
            System.out.println("Empty List");
        }
        else{
            Node temp = head.next;
            System.out.print("["+head.data+"->");
            while(temp.next.next != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.print(temp.data+"]");
        }
    }
}
