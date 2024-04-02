class Solution:
    def isAnagram(self, s, t):
        test1=''.join(sorted(s))
        test2=''.join(sorted(t))
        if(test1==test2):
            return True
        else:
            return False