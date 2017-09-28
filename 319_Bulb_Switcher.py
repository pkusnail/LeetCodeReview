class Solution(object):
    def bulbSwitch(self, n):
        """
        :type n: int
        :rtype: int
        """
        sum=0;
        i=1;
        while i*i <=n:
            sum=sum+1
            i=i+1
            
        return sum
