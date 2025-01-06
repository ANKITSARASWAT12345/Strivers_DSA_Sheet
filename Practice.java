import java.util.*;
//second largest element in the array

/*class Practice{
    public static void main(String[] args) {
        int arr[]={-1,-2,3,-4,-4,-5,-5};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
       
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];

            }

        }

        System.out.println(secondMax);
    }
}*/


//check if array os sorted or not

/*class Practice{
    public static void main(String[] args) {
        int arr[]={100,600,300,90,30};
        int n=arr.length;
        boolean result=true;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
               result=false;
            }
            
        }
        System.out.println(result);
    }
}*/





//Remove Duplicates in-place from Sorted Array

/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,4,4,5,6,6};
        int n=arr.length;
        int k=sortedArray(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int sortedArray(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];

            }
        }
        return i+1;
    }
}*/


//Left Rotate the Array by One

/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int j=0;
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}*/


//Rotate array by K elements

/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int k=2;
        int temp[]=new int[k];
        for(int i=n-k;i<n;i++){
            temp[i-n+k]=arr[i];
        }
        for(int i=n-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
        System.out.println("Array after rotation will be: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/


//move zeroes to end of the array

/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,0,3,0,4,3,0,6};
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        while(j<n){
            arr[j++]=0;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/


//Union of Two Sorted Arrays

import java.util.ArrayList;
import java.util.HashMap;

/*class Practice{
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,4};
        int arr2[]={4,5,6,7,5,4,4};
        int n=arr1.length;
        int m=arr2.length;
        ArrayList<Integer> li=unionFunction(arr1,arr2,n,m);
        for(int val:li){
            System.out.print(val+" ");
        }
    }
    static ArrayList<Integer> unionFunction(int arr1[],int arr2[],int n,int m){
        HashMap<Integer,Integer> freq=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<m;i++){
            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        }
        for(int i:freq.keySet()){
            result.add(i);
        }
        return result;
    }
}*/


//Count Maximum Consecutive One's in the array

/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,1,0,3,1,1,1,1,5,1,1,1,1,1,1,1};
        int n=arr.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            max=Math.max(count,max);
            if(arr[i]!=1){
                count=0;
            }
     
        }
        System.out.println(max);
    }
}*/


//Find the number that appears once, and the other numbers twice


//Method 1

/*class Practice{
    public static void main(String[] args) {
        int arr[]={2,2,1,4,1,5,4};
        int n=arr.length;
        int k=appearsFun(arr,n);
        System.out.println(k);
    }
    static int appearsFun(int arr[],int n){
        int max=arr[0];
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
        }
        int hash[]=new int[max+1];


        //hash he gven function
        for(int i=0;i<n;i++){
            hash[arr[i]]++;

        }

        //find single element with 1 frequency

        for(int i=0;i<n;i++){
            if(hash[arr[i]]==1){
                return arr[i];
            }
        }
        return -1;

    }
}*/


//Method 2

/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,1,2};
        int n=arr.length;
        int k=frequencyFun(arr,n);
        System.out.println(k);
    }
    static int frequencyFun(int arr[],int n){
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            int value=mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i],value+1);
        }

        for(Map.Entry<Integer,Integer> i:mpp.entrySet()){
            if(i.getValue()==1){
                return i.getKey();
            }
        }
        return -1;
    }
}*/


//Optimal approch

/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,3,4};
        int xor=0;
        for(int i=0;i<arr.length;i++){
           xor=xor^arr[i];
        }
        System.out.println(xor);
    }
}*/



//longest subarray with given sum

/*class Practice{
    public static void main(String[] args) {
        int arr[]={2,3,5};
        int n=arr.length;
        int k=3;
        int count=0;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
           sum=sum+arr[i];
          count++;
          if(sum==k){
           max=Math.max()
          }
        }
    }
}
*/


//Longest Subarray with given Sum K(Positives)

//brute force approch

/*class Practice{
    public static void main(String[] args) {
        int arr[]={2,3,5};
        int n=arr.length;
        int count=0;
        int k=5;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    count=Math.max(count,j-i+1);
                }
            }
        }
        System.out.println(count);
    }
}*/

//two pointer approch

/*class Practice{
    public static void main(String[] args) {
        int arr[]={-1,1,1};
        int n=arr.length;
        int k=1;
        int len=longestSub(arr,n,k);
        System.out.println(len);
    }
    static int longestSub(int arr[],int n,int k){
        int left=0;
        int right=0;
        int sum=arr[0];
        int maxLength=0;
        while(right<n){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxLength=Math.max(maxLength,right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }


        }
        return maxLength;
    }
}*/


//two sum approch

//brute force approch

/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,1,4,5,6};
        int n=arr.length;
        int targetSum=3;
        boolean result=false;
        for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==targetSum){
                result=true;
                break;
            }
           }
        }
        System.out.println(result);
    }
}*/


//using Hashing

/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,2,3,52,6,7};
        int n=arr.length;
        int targetSum=11;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int num=0;
        boolean result=false;
        for(int i=0;i<n;i++){
          num=arr[i];
          int remainingSum=targetSum-num;
          if(mpp.containsKey(remainingSum)){
               result=true;
          }
          mpp.put(arr[i], i);

        }
        System.out.println(result);

    }
}*/


//Sort an array of 0s, 1s and 2s

/*class Practice {
    public static void main(String[] args) {
       
      
       ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{1,2,0,2,1}));
       int n=arr.size();
       sortArray(arr,n);

       for(int i=0;i<n;i++){
        System.out.print(arr.get(i)+" ");
       }

    }
    public static void sortArray(ArrayList<Integer> arr,int n){
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)==0){
               count0++;
            }
            else if(arr.get(i)==1){
                count1++;
            }
            else {
                count2++;
            }
        }
        for(int i=0;i<count0;i++){
            arr.set(i,0);
        }
        for(int i=count0;i<count0+count1;i++){
            arr.set(i,1);
        }
        for(int i=count0+count1;i<n;i++){
            arr.set(i,2);
        }
    }

}*/


//find the majority element in the array

/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,2,2,1};
        int n=arr.length;
        int k=findMajorityElement(arr,n);
        System.out.println(k);


    }

     static int findMajorityElement(int arr[],int n){
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            int value=mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value+1);
        }
        for(Map.Entry<Integer,Integer> it:mpp.entrySet()){
            if(it.getValue()>(n/2)){
                return it.getKey();
            }
        }
        return  -1;
    }
    
}*/



//moore's voting  algorithm


/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,2,2,1,2};
        int n=arr.length;

        int ct=0;
        int el=0;
        for(int i=0;i<n;i++){
            if(ct==0){
                ct=1;
                el=arr[i];
            }
            else if(el==arr[i]){
                ct++;
            }
            else{
                ct--;
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el){
                count++;
            }
        }
        if(count>(n/2)){
            System.out.println(el);
        }
        else{
            System.out.println("not found");
        }
    }
}*/



//: Maximum Subarray Sum in an Array


/*class Practice{
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int maxSum=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
               
                sum+=arr[j];
                maxSum=Math.max(maxSum,sum);
            }
        }
        System.out.println(maxSum);
    }
}*/



//Kadane's Algorithm 

/*class Practice{
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int maxSum=0;
        int currSum=0;
        for(int i=0;i<n;i++ ){
            currSum+=arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
              currSum=0;
            }
        }
        System.out.println(maxSum);
    }
}*/


//leaders in an array problem

/*class Practice{
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        int n=arr.length;
        ArrayList<Integer> li=new ArrayList<>();
        int j=0;
        int lead=arr[n-1];
       li.add(lead);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>lead){
                lead=arr[i];
                li.add(lead);
            }
            
        }
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }
        System.out.println();
    }
}*/



//Stock Buy And Sell Probelm

//Brute_force_approch

/*class Practice{
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,40};
        int n=prices.length;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
             if(prices[j]>prices[i]){}
               maxProfit=Math.max(maxProfit,prices[j]-prices[i]);
            }
            }
        
        System.out.println(maxProfit);

    }
}*/

//Better approch

/*class Practice{
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int n=prices.length;
        int maxProfit=0;
        int minPrices=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minPrices=Math.min(minPrices,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minPrices);
        }
        System.out.println(maxProfit);
    }
}*/


//Rearrange Array Elements by Sign


//Brute force approch

/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,-6,-3,2,5};
        int n=arr.length;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
              pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }

        for(int i=0;i<n/2;i++){
            arr[i*2]=pos.get(i);
            arr[i*2+1]=neg.get(i);
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
*/


//optimal approch

/*class Practice{
    public static void main(String[] args) {
        int arr[]={1,2,-4,3,-9,-5};
       
        int n=arr.length;
        int ans[]=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
               ans[pos]=arr[i];
               pos+=2;
            }
            else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
*/



//Longest Consecutive Sequence in an Array

class Practice{
    public static void main(String[] args) {
        int arr[]={100, 200, 1, 3, 2, 4};
        int n=arr.length;
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(arr[i]-arr[j])==1){
                    count++;
                }
            }
        }
        System.out.println("count is "+count);
    }
}

//check a matrix is identity matrix or not

/*class Practice{
    public static void main(String[] args) {
        
        int arr[][]={{1,0,0},{0,1,0},{0,0,1}};
        /*{1, 0, 0},    
          {0, 1, 0},    
          {0, 0, 1}   

        int n=arr.length;
        int m=arr[0].length;
        boolean result=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j&&arr[i][j]!=1){
                    result=false;
                    break;
                }
                if(i!=j&&arr[i][j]!=0){
                   result=false;
                   break;
                }
            }
        }
        if(result){
            System.out.println("yes it is a identity matrix");
        }
        else{
            System.out.println("noooooooooooo!!!");
        }
    }
}*/


//Set Matrix Zero

/*class Practice{
    public static void main(String[] args) {
        int arr[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int n=arr.length;
        int m=arr[0].length;
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                   a=i;
                   b=j;
                   break;
                }
            }
        }
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
             if(i==a){
                arr[i][j]=0;
             }
             if(j==b){
                arr[i][j]=0;
             }
          }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }
}*/


