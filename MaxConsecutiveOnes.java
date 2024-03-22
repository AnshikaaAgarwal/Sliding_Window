class Solution {
    public static int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int max=0;
        int n=nums.length;
        int count_zeroes=0;
        for(j=0;j<n;j++){
            if(nums[j]==0){
                count_zeroes++;
            }
            while(i<=j && count_zeroes>k){
                if(nums[i]==0){
                    count_zeroes--;
                }
                i++;
            }
            max=Math.max(max,j-i+1);
        }
    return max;
        
    }
    public static void main(String[] args) {
        int [] nums={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int res=longestOnes(nums,k);
        System.out.println(res);
    }
}