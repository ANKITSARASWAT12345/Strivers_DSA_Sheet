
//Removing duplicates from the sorted array

/*public class Array {

   public static void main(String[] args) {
      int arr[]={1,2,3,3,4,5,5};
      int n=arr.length;
      int k=fun1(arr,n);
      for(int i=0;i<k;i++){
         System.out.print(arr[i]+" ");
      }
   }
   public static int fun1(int arr[],int n){
      int res=1;
      for(int i=1;i<n;i++){
         if(arr[res-1]!=arr[i]){
            arr[res]=arr[i];
            res++;
         }
         
      }
      return res;

   }
}*/

//removing duplicates for the unsorted arrray

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*class Array{
   public static void main(String[] args) {
      int arr[]={1,2,2,3,4,4,5};
      int n=arr.length;
      duplicate(arr,n);
   }
   public static void duplicate(int arr[],int n){
      HashMap<Integer,Integer> mp=new HashMap<>();

      for(int i=0;i<n;i++){
         if(!mp.containsKey(arr[i])){
            System.out.print(arr[i]+" ");
            mp.put(arr[i], 1);
         }
      }

   }
}*/


//left rortate an array by 1 place

/*class Array{
   public static void main(String[] args) {
      int arr[]={1,2,3,4,5};
      int n=arr.length;
      int temp=arr[0];
      for(int i=1;i<n;i++){
         arr[i-1]=arr[i];
      }
      arr[n-1]=temp;

      for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
      }
   }
}*/


//left rotate an array by d places

/*class Array{
   public static void main(String[] args) {
      int arr[]={1,2,3,4,5};//{3,4,5,1,2}

      int d=2;
      int n=arr.length;
      rotateBy_d_placed(arr,d,n);
      for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
      }
   }
   public static void rotateBy_d_placed(int arr[],int d,int n){
         int temp[]=new int[d];
         for(int i=0;i<d;i++){
            temp[i]=arr[i];
         }
         for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
         }

         for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
         }

         
   }
}*/

//move zeroes to the end of the array

/*class Array{
   public static void main(String[] args) {
      int arr[]={0,1,0,5,0,3,4,3};
      int n=arr.length;
      swap_zeros(arr,n);
      for(int i=0;i<n;i++){
         System.out.print(arr[i]+"  ");
      }



   }
   public static void swap_zeros(int arr[],int n){
      int count=0;
      for(int i=0;i<n;i++){
         if(arr[i]!=0){
            arr[count++]=arr[i];
         }
      }
      while(count<n){
         arr[count++]=0;
      }
   }
}*/


//find the missing number using XOR operation

/*class Array{
   public static void main(String[] args) {
      int arr[]={1,2,3,5};
      int N=5;
      int k=missing_number(arr,N);
      System.out.println(k);
   }
   static int missing_number(int arr[],int N){
      int XOR1=0;
      int XOR2=0;
      for(int i=0;i<N-1;i++){
         XOR1=XOR1^arr[i];
         XOR2=XOR2^(i+1);

      }
      XOR2=XOR2^N;
      return XOR2^XOR1;
   }
}*/


//Find the number that appears once, and the other numbers twice

/*class Array{
   public static void main(String[] args) {
      int arr[]={1,2,2,3,3};
      int n=arr.length;
      int res=0;
      for(int i=0;i<n;i++){
         res=res^arr[i];
      }
      System.out.println(res);
   }
}*/


//Longest Subarray with given Sum K(Positives)


/*class Array{
   public static void main(String[] args) {
      int arr[]={2,3,5,1,9};
      int n=arr.length;
      int k=10;
      int max=0;
      int count=0;
      for(int i=0;i<n;i++){
         
      }
   }
}*/


//longest subarray with given sum
//using two loops

/*class Array{
   public static void main(String[] args) {
      int arr[]={2,3,1,91,10};
      int n=arr.length;
      int k=10;
      int max_length=subArray_sum(arr,n,k);

      System.out.println(max_length);
   }
   public static int subArray_sum(int arr[],int n,int k){
          int len=0;
          for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
               sum+=arr[j];
               if(sum==k){
                len=Math.max(len,j-i+1);
               }
            }

          }
          return len;
   }
}*/



//using hashmap


/*class Array{
   public static void main(String[] args) {
      int arr[]={2,3,5,1,9};
      int n=arr.length;
      long k=10;
      int max_length=subArray_sum(arr,n,k);

      System.out.println(max_length);
   }
   static int subArray_sum(int arr[],int n,long k){

      int max_len=0;
      HashMap<Long,Integer> mp=new HashMap<>();
      long curr_sum=0;
      for(int i=0;i<n;i++){
         curr_sum+=arr[i];
         if(curr_sum==k){
            max_len=Math.max(max_len,i+1);

         }
         long rem_sum=k-curr_sum;
         if(mp.containsKey(rem_sum)){
            int len=i-mp.get(rem_sum);
            max_len=Math.max(len,max_len);
         }
         if(!mp.containsKey(rem_sum)){
            mp.put(rem_sum, i);
         }
      }
      return max_len;
   }
}*/


//using two pointer approch

/*class Array{
   public static void main(String[] args) {
      int arr[]={1,2,5,1,9};
      int n=arr.length;
      int k=10;
      int len=longest_subArray(arr,n,k);
      System.out.println(len);
   }
   public static  int longest_subArray(int arr[],int n,int k){
          int left=0;
          int right=0;
          int sum=arr[0];
          int max_lenght=0;
          while(right<n){
            
            while(left<=right && sum>k){
               sum-=arr[left];
               left++;
            }
            if(sum==k){
               max_lenght=Math.max(max_lenght,right-left+1);
            }
            right++;
            if(right<n){
            sum+=arr[right];
            
            }
          }
          return max_lenght;

   }
}*/



//Two Sum : Check if a pair with given sum exists in Array

//two pointer approch

/*public class Array {

    public static void main(String[] args) {
      int arr[]={1,5,3,7,6,2};//{1,2,3,5,7};
      int target=22;
      int n=arr.length;
      boolean result=two_sum(arr,n,target);
      System.out.println(result);
    }
    public static boolean two_sum(int arr[],int n,int target){
          int left=0;
          int right=n-1;
          Arrays.sort(arr);

          while(left<right){
             int sum=arr[left]+arr[right];
             if(sum==target){
               return true;
             }
             else if(sum<target){
               left++;
             }
             else{
               right--;
             }
          }
          return false;

    }
}*/



//Maximum differenece problem with order


/*class Array{
   public static void main(String[] args) {
      int arr[]={1,3,10,6,4,8,1};
      int min_element=arr[0];
      int max_diff=0;
      int n=arr.length;
      for(int i=1;i<n;i++){
           max_diff=Math.max(max_diff,arr[i]-min_element);
           min_element=Math.min(min_element,arr[i]);
      }

      System.out.println(max_diff);
   }
}*/


//Maximum sum subArray



/*public class Array {

   public static void main(String[] args) {
      int arr[]={-6,-1,-8};
      int n=arr.length;
      int res=arr[0];
      int max_ending=arr[0];
      for(int i=1;i<n;i++){
         max_ending=Math.max(max_ending+arr[i],arr[i]);
         res=Math.max(res,max_ending);
      }
      System.out.println(res);
   }
}*/


//Majority element

/*class Array{
   public static void main(String[] args) {
      int arr[]={3,7,4,7,7,5};
      int n=arr.length;
      int Majority_element=Majority_element_find(arr,n);
      System.out.println(Majority_element);
   }
   public static int Majority_element_find(int arr[],int n){
      int res=0;
      int count=1;
      for(int i=1;i<n;i++){
         if(arr[res]==arr[i]){
            count++;
         }
         else{
            count--;
         }
         if(count==0){
            res=i;
            count=1;
         }
      }

      count=0;
      for(int i=0;i<n;i++){
         if(arr[res]==arr[i]){
            count++;
         }
      }
         if(count<=n/2){
            res=-1;
         }
      
      return res;


   }
}*/


/*Stock Buy And Sell

Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/


 /*class Array{
   public static void main(String[] args) {
      int arr[]={7,1,5,3,6,4};
      int n=arr.length;
      int max_profit=0;
      for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
            if(arr[j]>arr[i]){
               max_profit=Math.max(arr[j]-arr[i],max_profit);
            }
         }
      }
      System.out.println(max_profit);
   }
 }*/


//optimal approch

/*class Array{
   public static void main(String[] args) {
      int arr[]={7,1,5,3,6,4};
      int n=arr.length;
      int min_element=arr[0];
      int max_profit=0;
      for(int i=0;i<n;i++){
         max_profit=Math.max(arr[i]-min_element,max_profit);
         min_element=Math.min(min_element, arr[i]);
      }
      System.out.println(max_profit);
   }
}*/


//longest consecutive sequence

/*class Array{
   public static void main(String[] args) {
      int arr[]={100,200,5,6,1,3,4,2};
      int n=arr.length;
      int longest=longest_sequence(arr,n);
      System.out.println(longest);
   }
   public static int longest_sequence(int arr[],int n){


      int longest=1;
      if(n==0){
         return 0;
      }
      HashSet<Integer> st=new HashSet<>();
      for(int i=0;i<n;i++){
         st.add(arr[i]);
      }

      for(int item:st){
           if(!st.contains(item-1)){
            int count=1;
            int x=item;
            while(st.contains(x+1)){
               x=x+1;
               count++;
            }
            longest=Math.max(longest,count);
           }
      }
      return longest;
   }
}*/


//Count Subarray sum Equals K

/*class Array{
   public static void main(String[] args) {
      int arr[]={3,1,2,4};
      int n=arr.length;
      int count=0;
      int k=6;
      int curr_sum=0;
      for(int i=0;i<n;i++){
         curr_sum+=arr[i];
         if(curr_sum==k){
            count++;
         }
      }
      System.out.println(count);
   }
}*/

//
class Array{
   public static void main(String[] args) {
      int arr[]={3,1,2,4};
      int n=arr.length;
      int count=0;
      int k=6;
      int curr_sum=0;
      for(int i=0;i<n;i++){
         curr_sum+=arr[i];
         if(curr_sum==k){
            count++;
         }
      }
      System.out.println(count);
   }
}

