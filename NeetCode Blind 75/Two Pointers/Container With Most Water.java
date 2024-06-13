class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int water=0;

        while(i<j){
            if(height[i]>height[j]){
                water=Math.max(water,Math.min(height[i],height[j])*(j-i));
                j--;
            }
            else{
                water=Math.max(water,Math.min(height[i],height[j])*(j-i));
                i++;
            }
        }
        return water;

    }
}