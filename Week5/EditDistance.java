package mayLeetCode;

public class EditDistance {
	public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for(int i = 0; i < word1.length() + 1; i++){
            for(int j = 0; j < word2.length() + 1; j++){
                dp[i][j] = -1;
            }
        }
        return ed(word1, word2, 0, 0, dp);
    }
    
    int ed(String word1, String word2, int i, int j, int[][] dp){
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(i == word1.length() || j == word2.length()){
            return dp[i][j] = (i == word1.length() ? word2.length() - j : word1.length() - i);
        }
        if(word1.charAt(i) == word2.charAt(j)){
            return dp[i][j] = ed(word1, word2, i + 1, j + 1, dp);
        }
        else{
            return dp[i][j] = 1 + Math.min(ed(word1, word2, i, j + 1, dp)
                                , Math.min(ed(word1, word2, i + 1, j, dp)
                                           , ed(word1, word2, i + 1, j + 1, dp)));
        }
    }

}
