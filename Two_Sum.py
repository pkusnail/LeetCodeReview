class node(object):
    val = 0
    idx = 0
    def __init__(self, val, idx):
        self.val = val
        self.idx = idx
        
    def __cmp__(self,other):  
        return cmp(self.val,other.val)
    
    pass

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        data=[]
        for idx in range(len(nums)):
            data.append(node(nums[idx],idx));
        data=sorted(data);
        limit=len(nums)-1;
        start=0;
        while start < limit :
            if (data[start].val + data[limit].val) == target :
                return [data[start].idx, data[limit].idx];
            elif (data[start].val + data[limit].val ) > target :
                limit=limit-1;
            else:
                start=start+1;
