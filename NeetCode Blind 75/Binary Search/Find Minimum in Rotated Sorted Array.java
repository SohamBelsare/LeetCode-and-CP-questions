class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1,mid;
        int min=Integer.MAX_VALUE;
        mid=(i+j)/2;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[i]<=nums[mid]){
                min=Math.min(min,nums[i]);
                i=mid+1;
            }
            else {
                min=Math.min(min,nums[mid]);
                j=mid-1;
                
            }
            
        }
        return min;

    }
}
