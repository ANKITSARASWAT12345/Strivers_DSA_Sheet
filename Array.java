
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

import java.util.HashMap;

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

class Array{
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
}