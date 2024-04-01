class Solution:
    def containsDuplicate(self, nums):
        mylist=list(set(nums))
        if len(nums)==len(mylist):
            return False
        else:
            return True