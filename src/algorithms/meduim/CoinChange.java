package algorithms.meduim;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for (int i = 1; i < amount + 1; i++) {
            //Set the dp to inf.
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        if( dp[amount] == Integer.MAX_VALUE) {
            return -1;
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        CoinChange test = new CoinChange();
        System.out.println(test.coinChange(new int[]{1, 2, 5}, 11));
    }
}
