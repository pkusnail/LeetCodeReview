class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 1:
            return 0;
        possible=dict();
        bad=dict();
        for idx in range(0,len(s)):
            if bad.has_key(s[idx]) :
                continue;
            elif possible.has_key(s[idx]):
                bad[s[idx]]=1;
                del possible[s[idx]];
            else:
                possible[s[idx]]=idx
       
        possible= sorted(possible.iteritems(), key=lambda d:d[1], reverse = False)
        if len(possible) > 0 :
            return possible[0][1];
        return -1;
