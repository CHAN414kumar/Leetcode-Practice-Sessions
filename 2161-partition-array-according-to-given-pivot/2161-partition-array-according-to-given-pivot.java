class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        List<Integer> list = new ArrayList<>();

        int start =0,end =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == pivot){
                list.add((start),nums[i]);
                end+=1;
            }else if(nums[i]<pivot){
                
                list.add(start,nums[i]);
                start += 1;
                end += 1;
            }else{
                list.add(end,nums[i]);
                end++;
            }
        }

        int[] arr = new int[list.size()];

        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }

        return arr ;
    }
}