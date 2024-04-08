class Solution:
    def topKFrequent(self,nums, k):
        list1=[]
        mydict={}
        for i in set(nums):
            mydict[i]=nums.count(i)
        mydict=dict(sorted(mydict.items(), key=lambda item: item[1]))
        mydict = dict(reversed(list(mydict.items())))
        for i in mydict:
            if(k>0):
                list1.append(i)
                k=k-1

        return list1