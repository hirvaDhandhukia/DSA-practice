class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = prices[0]
        profit = 0
        for i in range(1, len(prices)): 
            if prices[i] < buy:
                # update buy
                buy = prices[i]
            elif prices[i]-buy > profit: 
                # update profit if current profit is greater in this loop
                profit = prices[i]-buy
        return profit
