class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length <=2){
            return nums.length;
        }

        int x=0, y=0;
        int highest = nums[0],smallest = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]>highest){
                x=i;
                highest = nums[i];
            }

            if(nums[i]<smallest){
                y=i;
                smallest = nums[i];
            }
        }

        int value1 = Math.min(x,y);
        int value2 = Math.max(x,y);

        int ans1 = value1+1;
        int ans2 = (nums.length-value2);
        int ans3 = ans1+ans2;
        int ans4 = value2+1;
        int ans5 = nums.length-value1;

        return Math.min(ans3,Math.min(ans4,ans5));


    }
}