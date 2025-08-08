package algorithms.easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];

    }

    public static void main(String[] args) {
        ClimbingStairs test = new ClimbingStairs();
        System.out.println(test.climbStairs(3));;
    }
}
