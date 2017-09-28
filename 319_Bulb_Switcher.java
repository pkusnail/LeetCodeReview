class Solution {
/* ans1 : Time Limit Exceeded
    public int bulbSwitch(int n) {
        int score[]=new int[n];
        for (int i = 0;i<n;i++){
            score[i] = 0;
        }
        for (int i=1;i<=n;i++){
            for (int j=(i-1);j<n;j=j+i){
                score[j] = score[j]^1;
            }
        }
        int sum=0;
        for (int i = 0;i<n;i++){
            sum +=score[i];
        }
        return sum;
    }
*/

 public int bulbSwitch(int n) {
        int sum=0;
        for(int i=1;i*i <= n;i++){
            sum+=1;
        }
        return sum;
    }
}

