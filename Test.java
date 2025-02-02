
//Reverse a linked list into group of size k
//recursive solution

/*class Node {
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
    
}
class Test{
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=new Node(7);
        head.next.next.next.next.next.next.next=new Node(8);
        printList(head);
        head=reverseKGroup(head,3);
        printList(head);


    }
    static Node reverseKGroup(Node head,int k){
        Node curr=head;
        Node next=null;
        Node prev=null;
        int  count=0;
        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
           count++;

        }
        if(curr!=null){
            Node rest_head=reverseKGroup(next, k);
            head.next=rest_head;
        }
        return prev;
    }
    static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}


*/




/*class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
  
class Test { 
    
    public static void main(String args[]) 
    { 
        Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;
    	detectRemoveLoop(head);
        printlist(head);
    } 
    
    static void detectRemoveLoop(Node head) 
    {   Node slow= head,fast = head; 
      
        while (fast!=null && fast.next!=null) { 
            slow = slow.next; 
            fast = fast.next.next; 
            if (slow == fast) { 
                break; 
            } 
        } 
        if(slow!=fast)
            return;
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;   
    }
    
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
} */


//sort a linked list

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

class Test{
    public static void main(String[] args) {
    Node head = new Node(3);
    head.next = new Node(2);
    head.next.next = new Node(5);
    head.next.next.next = new Node(499);
    head.next.next.next.next = new Node(1);

    System.out.print("Original Linked List: ");
    printLinkedList(head);
    head=sortLinkedList(head);
    System.out.println("Linked list after sorting");
    printLinkedList(head);

    }
    public static void printLinkedList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static Node sortLinkedList(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node middle=findMiddle(head);

        Node leftNode=head;
        Node rightNode=middle.next;
        middle.next=null;

        leftNode=sortLinkedList(leftNode);
        rightNode=sortLinkedList(rightNode);

        return mergeTwoSortedLinkedList(leftNode,rightNode);
    }

    public static Node mergeTwoSortedLinkedList(Node List1,Node List2){

      Node dummyNode=new Node(-1);
        Node temp=dummyNode;
        while(List1!=null && List2!=null){
            if(List1.data<=List2.data){
                 temp.next=List1;
                 List1=List1.next;
            }
            else{
                temp.next=List2;
                List2=List2.next;
            }
            temp=temp.next;

            if(List1!=null){
                temp.next=List1;
            }
            else{
                temp.next=List2;
            }
        }
        return dummyNode.next;

    }


    public static Node findMiddle(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}






