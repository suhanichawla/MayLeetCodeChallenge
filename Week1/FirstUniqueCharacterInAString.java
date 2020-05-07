package mayLeetCode;

public class FirstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            if(s.indexOf(String.valueOf(s.charAt(i)))==s.lastIndexOf(String.valueOf(s.charAt(i)))){
                return i;
            }
        }
        return -1;
    }

}
