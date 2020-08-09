package mayLeetCode;

public class UncrossedLines {
	public int maxUncrossedLines(int[] A, int[] B) {
        int[] arr= new int[B.length];
        int[][] dp=new int[A.length+1][B.length+1];
        for (int i = A.length - 1; i >= 0; i--) {
            for (int j = B.length - 1; j >= 0; j--) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }

}
