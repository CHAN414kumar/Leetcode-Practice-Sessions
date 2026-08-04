class Solution {
    public void combination(int idx,int[] candidates,int target,List<Integer> arr,List<List<Integer>> ans){
        if(idx == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        if(target<0){
            return;
        }
        arr.add(candidates[idx]);
       
        combination(idx,candidates,target-candidates[idx],arr,ans);
       
        arr.remove(Integer.valueOf(candidates[idx]));
        combination(idx+1,candidates,target,arr,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();

        combination(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}