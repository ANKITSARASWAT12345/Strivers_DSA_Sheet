
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


/*class Test{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}*/



/*class Test{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                if(j==4){
                  break;
                }
                System.out.print("1"+" ");
            }
            System.out.println();
        }
    }
}*/

public class Test
{
	public static void main(String[] args) {
		int n=3,temp=1;
		for(int i =0; i<n; i++) {
			if(i%2==0) {
				for(int j = 0; j<=n; j++) {
					if(j==n ) {
						System.out.print(temp+1);
					} else {
						System.out.print(temp);
					}
				}
				temp++;
			}
			if(i%2!=0) {
				for(int j = n; j>=0; j--) {
					if(j==n ) {
						System.out.print(temp+1);
					} else {
						System.out.print(temp);
					}
				}
				temp++;
			}

			System.out.println();

		}
	}
}
