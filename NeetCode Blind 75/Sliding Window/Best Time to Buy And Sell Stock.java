class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;
        int sell=0;
        int profit=0;

        while(sell<buy || sell<=prices.length-1){
            if(prices[buy]<=prices[sell]){
                if(profit<=prices[sell]-prices[buy]){
                    profit=prices[sell]-prices[buy];
                }
                sell++;
            }
            else{
                buy=sell;
                sell++;
                
            }

        }
        return profit;
    }
}