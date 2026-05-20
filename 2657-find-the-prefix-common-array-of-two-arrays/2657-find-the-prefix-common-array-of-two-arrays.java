class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr = new int[A.length];
        
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<A.length;i++){
            list.add(A[i]);
            int count =0;
            for(int j=i;j>=0;j--){
                
            if(list.contains(B[j])){
                count++;
            }
            }

            arr[i]=count;

        }

        return arr;
    }
}