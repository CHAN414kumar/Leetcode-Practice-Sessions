class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int count =1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>(k*count)){
                return k*count;
            }else if(nums[i]==(k*count)){
                count++;
            }
            
        }
        return k*count;
    }
}