package LinkedList;

class Node1{
    int data;
    Node1 next;

    Node1(int data , Node1 next){
        this.data = data;
        this.next = next;
    }

    Node1(int data){
        this.data = data;
        this.next = null;
    }

}

public class DeletionInLinkedList {

    public static void printLinkedList(Node1 head){
        Node1 temp = head;

        while(temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }


    public static Node1 deleteHead(Node1 head){
        Node1 temp = head;
        head = head.next;
        return head;

    }

    public static Node1 deleteTail(Node1 head){
        Node1 temp = head;
        if(head == null ||  head.next == null) return null;
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;

        return head;

    }

    public static Node1 deleteK(Node1 head , int k){
        if(head == null)return head;
        //means i need to remove head
        if(k==1){
            Node1 temp = head;
            head = head.next;
            return head;
        }
       int count = 0; Node1 temp = head;Node1 prev = null;

       while(temp!=null){
           count++;

           if(count == k){
               prev.next= prev.next.next;
               break;
           }
           prev = temp;
           temp = temp.next;

       }
       return head;
    }


    public static void main(String[] args) {


    Node1 z = new Node1(40,null);
    Node1 y = new Node1(30,z);
    Node1 x = new Node1(20,y);
    Node1 head = new Node1(10,x);
    Node1 temp = head;

    System.out.println();
    System.out.print("BEFORE HEAD DELETION - > ");
    printLinkedList(head);
    head = deleteHead(head);
    System.out.println();
    System.out.print("AFTER HEAD DELETION - > ");
    printLinkedList(head);
    System.out.println();
    System.out.print("AFTER TAIL DELETION - > ");
    head = deleteTail(head);
    printLinkedList(head);
    System.out.println();
    System.out.print("AFTER KTH DELETION -> ");
    head = deleteK(head,1);
    printLinkedList(head);



    }
}
