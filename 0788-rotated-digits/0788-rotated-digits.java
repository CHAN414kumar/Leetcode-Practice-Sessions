class Solution {
    public int rotatedDigits(int n) {
        int k=n;
        int count =0;
       
            
            for(int i=1;i<=k;i++){
                int m =i;
                 boolean isOk = false;
                boolean isRotatable = true;
                while(m>0){
                    int lastDigit = m%10;
                    if(lastDigit == 0 || lastDigit ==1 || lastDigit == 3 || lastDigit == 4 ||lastDigit == 7 || lastDigit == 8){
                        if(lastDigit == 0 || lastDigit ==1 || lastDigit == 8 ){
                            if(m/10 >0 || isOk){
                                m=m/10;
                                continue;
                            }
                        }

                        isRotatable =false;
                        break;
                    }
                    isOk= true;
                    m=m/10;
                }
                if(isRotatable){
                    count++;
                }
        }
        return count;
    }
}