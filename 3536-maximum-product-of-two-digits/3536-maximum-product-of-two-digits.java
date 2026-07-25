class Solution {
    public int maxProduct(int n) {
        int firstNum=n%10;
        n=n/10;
        int secondNum = n%10;
        n=n/10;
        while(n>0){
            int rem=n%10;
            if(rem>firstNum || rem>secondNum){
                if(firstNum<secondNum){
                    firstNum = rem;
                 }else{
                    secondNum = rem;
                 }
            }

            n=n/10;
            
        }

        return firstNum * secondNum;
    }
}