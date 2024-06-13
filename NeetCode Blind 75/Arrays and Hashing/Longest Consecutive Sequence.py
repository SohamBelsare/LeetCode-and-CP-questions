class Solution:
    def longestConsecutive(self, nums):
        nums=list(set(nums))
        nums.sort()
        list1=[]
        cnt=0
        if len(nums)==0 :
            return 0
        elif len(nums)==1:
            return 1
        else:
            for i in range(len(nums)-1) :
                if (nums[i+1]==nums[i]+1):
                    cnt+=1
                    list1.append(cnt)
                else:
                    cnt=0
                    list1.append(cnt)
            list1.sort(reverse=True)
            return list1[0]+1
        