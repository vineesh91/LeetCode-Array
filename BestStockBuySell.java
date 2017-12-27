public class BestStockBuySell {
    public int maxProfit(int[] prices) {
        int prof = 0;
        for(int i = 0; i < prices.length-1; i++) {
            for (int j = i; j < prices.length; j++) {
                if((prices[j] - prices[i]) > prof) {
                    prof = (prices[j] - prices[i]);
                }
            }
        }
        return prof;
    }
}
