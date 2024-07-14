class Solution {
    public int maxProfit(int[] prices) {
        // buying (minPrice), selling (maxPrice) 
        int minPrice = Integer.MAX_VALUE; 
        int maxProfit = 0; 

        for(int i=0; i<prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}