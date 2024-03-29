public class CountSubarraysWhereMaxElementAppearsaLeastKTimes {
    public static long countSubarrays(int[] nums, int k) {
        long total_count=0;
        long res=0;
        long subcount=countLeastSubarrays(nums,k);
        for(int m=1;m<=nums.length;m++){
            total_count=total_count+m;
        }
        res=total_count-subcount;
        return res;   
    }
    public static int maxArray(int[]nums){
        int res=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            res=Math.max(res,nums[i]);
        }
        return res;
    }
    public static long countLeastSubarrays(int[]nums,int k){
        int i=0;
        int j=0;
        int max=maxArray(nums);
        int count_max=0;
        long count_least=0;
        int n=nums.length;
        while(j<n){
            if(nums[j]==max){
                count_max++;
            }

            while(count_max>=k){
                if(nums[i]==max){
                    count_max--;
                }
                i++;
            }
            count_least=count_least+(j-i+1);
            j++;
        }
        return count_least;
    }
    public static void main(String[] args) {
        int [] nums={1,3,2,3,3};
        int k=2;
        long ans=countSubarrays(nums,k);
        System.out.println(ans);
    }
    
}
