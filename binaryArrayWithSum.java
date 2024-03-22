import java.util.*;
public class binaryArrayWithSum {
    public static int numSubarraysWithSumk(int[] nums, int goal) {
        int i=0;
        int j=0;
        int n=nums.length;
        long sum=0;
        int count=0;
        for(j=0;j<n;j++){
            sum=sum+nums[j];
            while(i<=j && sum>goal){
                sum=sum-nums[i];
                i++;
            }
            count=count+(j-i+1);
        }
        return count;
        
    }
    
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarraysWithSumk(nums,goal)-numSubarraysWithSumk(nums,goal-1);
    }
    public static void main(String[] args) {
        int [] nums={1,0,1,0,1};
        int goal=2;
        int res= numSubarraysWithSum( nums, goal);
        System.out.println(res);
    }
    
}
