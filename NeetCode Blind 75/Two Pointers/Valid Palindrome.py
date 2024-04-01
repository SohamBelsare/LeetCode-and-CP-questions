import string
class Solution:
    def isPalindrome(self, s):
        alphabet = list(string.ascii_lowercase)
        flag=0
        s=s.lower()
        i,j=0,len(s)-1