import java.util.*;
public class CountNiceSubarrays {
    public static int numberOfSubarraysk(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        int count=0;
        int c_odd=0;
        for(j=0;j<n;j++){
            if(nums[j]%2!=0){
                c_odd++;
            }
            while(i<=j && c_odd>k){
                if(nums[i]%2!=0){
                c_odd--;
                }
                i++;
            }
            count=count+(j-i+1);
        }
        return count;
    
}
public static int numberOfSubarrays(int[] nums, int k) {
    return  numberOfSubarraysk( nums, k)- numberOfSubarraysk(nums,k-1);
    
}
public static void main(String[] args) {
    int [] nums={1,1,2,1,1};
    int k=3;
    int res=numberOfSubarrays(nums,k);
    System.out.println(res);
}
}
