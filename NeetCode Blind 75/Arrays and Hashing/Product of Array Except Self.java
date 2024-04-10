class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prepod= new int[nums.length];
        int[] sufpod= new int[nums.length];
        int[] result= new int[nums.length];
        prepod[0]=1;
        sufpod[nums.length-1]=1;
        for(int i=1;i<=nums.length-1;i++){
            prepod[i]=prepod[i-1]*nums[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            sufpod[j]=sufpod[j+1]*nums[j+1];
        }
        for(int i=0;i<=nums.length-1;i++){
            result[i]=prepod[i]*sufpod[i];
        }
        return result;
    }
}