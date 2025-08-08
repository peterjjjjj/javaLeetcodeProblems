package algorithms.meduim;

public class UniquePath {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        //The first row always has 1 path, which is all the way to the right.
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        //Same with first column.
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];

    }

    public static void main(String[] args) {
        UniquePath test = new UniquePath();
        System.out.println(test.uniquePaths(3, 7));
    }
}
