class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[] = new int[m+n];

        int i=0,j=0,idx=0;

        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                ans[idx++]=nums1[i];
                i++;
            }else{
                ans[idx++] = nums2[j];
                j++;
            }
        }

        while(i<m){
            ans[idx++]= nums1[i++];
        }
        while(j<n){
            ans[idx++]=nums2[j++];
        }

        idx = idx-1;
        while(idx>=0){
            nums1[idx]=ans[idx];
            idx--;
        }

    }
}