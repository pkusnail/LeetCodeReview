class Solution {
    public int[] plusOne(int[] digits) {
        int adv=1;
        int tmp=0;
        for (int i=(digits.length -1); i>=0; i-- ){
            tmp=digits[i];
            digits[i]=(adv+tmp)%10;
            adv=(adv+tmp)/10;
        }
        if(adv == 0){
            return digits;
        }else{
            int[] ret=new int[digits.length+1];
            ret[0]=adv;
            for(int i=0;i<digits.length;i++){
                ret[i+1]=digits[i];
            }
            return ret;
        }
    }
}
