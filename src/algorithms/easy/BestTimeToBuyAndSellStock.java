package algorithms.easy;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int lowPrice = prices[0];
        int highPrice = prices[1];

        for (int i = 1; i < prices.length; i++) {
            if (lowPrice > prices[i]) {
                lowPrice = prices[i];
            }

            if (highPrice < prices[i]) {
                highPrice = prices[i];
            }
        }

        int maxProfit = highPrice - lowPrice;

        return Math.max(maxProfit, 0);

    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(prices));

    }
}
