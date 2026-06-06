class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int[] ans = new int[nums.length];
        int lsum=0,rsum=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        rsum=sum;
        rsum-=nums[0];
        ans[0]=rsum;
        
        for(int i=1;i<nums.length;i++){
            lsum+=nums[i-1];
            rsum-=nums[i];

            int res = (int)Math.abs(lsum-rsum);
            ans[i]=res;
        }

        return ans;
    }
}