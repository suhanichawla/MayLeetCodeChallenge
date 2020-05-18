package mayLeetCode;

public class PermutationInString {
	 public boolean checkInclusion(String s1, String s2) {
	       if (s1.length() > s2.length())
	            return false;
	        int[] arrs1 = new int[26];
	        for (int i = 0; i < s1.length(); i++){
	            arrs1[s1.charAt(i) - 'a']++;
	        }
	        for (int i = 0; i <= s2.length() - s1.length(); i++) {
	            int[] arrs2 = new int[26];
	            for (int j = 0; j < s1.length(); j++) {
	                arrs2[s2.charAt(i + j) - 'a']++;
	            }
	            if (matches(arrs1, arrs2)){
	                return true;
	            }
	        }
	        return false;
	    }
	    
	        
	    public boolean matches(int[] arrs1, int[] arrs2) {
	        for (int i = 0; i < 26; i++) {
	            if (arrs1[i] != arrs2[i])
	                return false;
	        }
	        return true;
	    }

}
