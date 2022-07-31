public class BuySellStock {
    private int[] prices;

    public BuySellStock(int[] prices) {
        this.prices = prices;
    }

    public int maxProfit() {
        int sell = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            if (sell > price) {
                sell = price;
            } else {
                int currentProfit = price - sell;
                profit = Math.max(profit, currentProfit);
            }
        }
        return profit;
    }
}
