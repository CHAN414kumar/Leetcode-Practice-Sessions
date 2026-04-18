class Solution {
    public int mirrorDistance(int n) {
        String s="";
        int k=n;
        while(n>0){
            int i = n%10;
            s+=i;
            n=n/10;
        }
        int rev= Integer.parseInt(s);
        return Math.abs(k-rev); 
    }
}