class Solution {
    public int totalWaviness(int num1, int num2) {
        int out=0;
        for(int i=num1;i<=num2;i++){
            List<Integer> list = new ArrayList<>();
            int k=i;
            while(k>0){
                list.add(k%10);
                k=k/10;
            }

            for(int j=1;j<list.size()-1;j++){
                if(list.get(j)>list.get(j-1) && list.get(j)>list.get(j+1)){
                    out++;
                }else if(list.get(j)<list.get(j-1) && list.get(j)<list.get(j+1)){
                    out++;
                }
            }
        }
        return out;
    }
}