import java.util.*;
class LargestSubarray{
    public static int fun(int[]arr,int k){
        int n=arr.length;
        int i=0;
        int j=0;
        long sum=0;
        int max=0;
        while(j<n){
            sum=sum+arr[j];
            if(sum<k){
              j++;  
            }
            else if(sum==k){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(sum>k){
                sum=sum-arr[i];
                i++;
                if(sum==k){
                    max=Math.max(max,j-i+1);
                }
                j++;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int [] arr={2,8,2,3,1,4,8,1,1,5,5};
        int k=10;
        int res=fun(arr,k);
        System.out.println(res);
        
    }
}
