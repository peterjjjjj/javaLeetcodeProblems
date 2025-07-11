package algorithms.easy;

public class BestTimeToBuyAndSellStock {
    /**
     * Calculates the maximum profit that can be achieved by buying a stock on one day
     * and selling it on a future day.
     * <p>
     * This method iterates through the prices in a single pass, keeping track of the
     * lowest price found so far, and the maximum profit possible.
     *
     * @param prices An array of integers representing the stock price on consecutive days.
     * The array must not be empty.
     * @return The maximum possible profit. Returns 0 if no profit can be made.
     */

    public int maxProfit(int[] prices) {


        int maxProfit = -1;
        int minPrice = prices[0];

        for (int price : prices) {
            if (price < minPrice){
                minPrice = price;
            }

            else if (price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(prices));

    }
}
