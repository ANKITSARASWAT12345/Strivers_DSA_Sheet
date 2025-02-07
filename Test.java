
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

/*class Node{
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
}*/


/*class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

class Test{
    public static void main(String[] args) {
        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(3);
        head1.next.next.next=new Node(4);
        head1.next.next.next.next=new Node(5);

        Node head2=new Node(10);
     
        head2.next=head1.next.next;
        printList(head2);
        printList(head1);
        Node head=findIntersectPoint(head1,head2);
        System.out.println(head.data);

    }
    public static Node findIntersectPoint(Node head1,Node head2){
        Node a=head1;
        Node b=head2;
        while(a!=b){
            a=a==null?head2:a.next;
            b=b==null?head1:b.next;
        }
        return a;
    }
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}*/

/*class Test{
    public static void main(String[] args) {
        int arr[]={1,2,3,50,50,6};
        int largest=Integer.MIN_VALUE;
        int second_larget=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_larget=largest;
                largest=arr[i];

            }
            else if(arr[i]>second_larget&& arr[i]!=largest){
                second_larget=arr[i];
            }
        }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>second_larget&& arr[i]!=largest){
        //         second_larget=arr[i];
        //     }
        // }
        System.out.println(second_larget);

        
    }
}*/


//remove duplicate from a sorted array
/*class Test{
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4};
        int n=arr.length;
       
        int j=1;
        
        for(int i=1;i<n;i++){
         if(arr[i]!=arr[i-1]){
            arr[j++]=arr[i];
         }
        }
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
*/



/*class Test{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int temp[]=new int[n];
      int c=0;
        int curr_sum=0;
        for(int i=0;i<n;i++){
            curr_sum+=arr[i];
            temp[i]=temp[i]+curr_sum;
        }

        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }

    }
}*/

//print Even length words in a String

/*class Test{
    public static void main(String[] args) {
        String st="i am ankit saraswat from mathura";
        for(String s:st.split(" ")){
            if(s.length()%2==0){
                System.out.println(s);
            }
        }
    }
}*/


//Insert a String into another String in Java


/*class Test{
    public static void main(String[] args) {
        String str="ankit saraswat";
        String s="kumar";
        int index=5;
        String new_string=new String();
        for(int i=0;i<str.length();i++){
            new_string+=str.charAt(i);
            if(i==index){
                new_string+=s;
            }
        }
        System.out.println(new_string);
    }
}*/


//check two string are anagram of each other

/*class Test{
    public static void main(String[] args) {
        char str1[]="ankit".toCharArray();
        char str2[]="kantti".toCharArray();
        int c=256;
        int count[]=new int[c];
        boolean result=true;
     

        for(int i=0;i<str1.length;i++){
            count[str1[i]-'a']++;
            count[str2[i]-'a']--;
        }
       

          for(int i=0;i<c;i++){
            if(count[i]!=0){
                result=false;
            }
          }

          System.out.println(result);



    }
}*/

//same question using hashmap

import java.util.HashMap;
import java.util.*;

/*class Test{
    public static void main(String[] args) {
        String s1="ankit";
        String s2="ktinda";
        System.out.println(find_anagram(s1,s2));

    }
    public static boolean find_anagram(String s1,String s2){
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(mp.containsKey(s1.charAt(i))){
                mp.put(s1.charAt(i),mp.get(s1.charAt(i))+1);
            }
            else{
                mp.put(s1.charAt(i), 1);
            }
        }
        for(int i=0;i<s2.length();i++){
           if(mp.containsKey(s2.charAt(i))){
            mp.put(s2.charAt(i), mp.get(s2.charAt(i))-1);
           }
        }
        Set<Character> st=mp.keySet();
        for(Character key:st){
            if(mp.get(key)!=0){
                return false;
            }
        }
        return true;
    }
}*/


//find the number of vowel and consonants in the string


/*class Test{
    public static void main(String[] args) {
        String str="ankueit";
       totalVowel(str);
    }
    public static void totalVowel(String str){
            int countVowel=0;
            int countConso=0;

            for(int i=0;i<str.length();i++){
                if(isVowel(str.charAt(i))){
                    countVowel++;
                }
                
                else{
                   countConso++;
                }
            }
           System.out.println(countVowel);
            System.out.println(countConso);
    }
    public static boolean isVowel(char ch){
        ch=Character.toUpperCase(ch);
        return (ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')&&ch>=65&&ch<=90;
    }
}*/


//you are given a single character ch if the character is in lower case then change it into upper case ,if it is in already is in uppercase then remain it same .


/*class Test{
    public static void main(String[] args) {
        char ch='a';

        if(ch>='a'&& ch<='z'){
            System.out.println(Character.toUpperCase(ch));
        }
        else{
            System.out.println(ch);
        }
    }
}*/

//taking character as a input form user

/*class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a character as input");
        char ch=sc.next().charAt(0);
        System.out.println(ch);
    }
}*/

//you are given an number N .Find and print the product of all number form 1 to N.


/*class Test{
    public static void main(String[] args) {
        int N=5;
        int product=1;
        for(int i=1;i<=N;i++){
            product=product*i;
        }
        System.out.println(product);
    }
}*/


//

class Test{
    public static void main(String[] args) {
       int arr1[]={1,2,3,4};
       int arr2[]={1,2,3};
       int arr3[]={1,2};

       int sum1=0;
       int sum2=0;
       int sum3=0;
       for(int i=0;i<arr1.length;i++){
        sum1+=arr1[i];
       }  
       for(int i=0;i<arr2.length;i++){
        sum2+=arr2[i];
       }  
       for(int i=0;i<arr3.length;i++){
        sum3+=arr3[i];
       }   
       int x=sum1-sum2;
       int y=sum2-sum3;

       System.out.println(x);
       System.out.println(y);
       
    }
}









