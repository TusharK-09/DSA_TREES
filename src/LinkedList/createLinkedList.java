package LinkedList;

class Node {
    int data;
    Node next;

    //constructor one
    Node (int data , Node next){
        this.data = data;
        this.next =next;
    }

    //constructor two
    Node (int data){
        this.data = data;
        this.next = null;
    }



}

public  class createLinkedList {
    public static int length(Node head){
        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;

        }
        return count;
    }

    //searching

    public static int search(Node head , int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target) return 1;
            temp = temp.next;
        }


        return 0;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = new Node(10);
        Node temp = head;
//        System.out.println("x ->" + x.data);
        Node y = new Node(20);
        head.next = y;

//        System.out.println("y -> "+ y.data);
        Node z = new Node(30);
        y.next = z;

//        System.out.println("z -> "+ y.next.data);

        //traversing through the linked list
        while(temp!= null){
            System.out.print(temp.data +  " ");
            temp = temp.next;
        }

        System.out.println();
        //length function call
        System.out.println( "Length -> " +length(head));

        //search function call
        System.out.println(search(head,40));


    }
}
