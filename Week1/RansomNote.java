package mayLeetCode;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb1=new StringBuilder(ransomNote);
        StringBuilder sb2=new StringBuilder(magazine);
        for(int i=0;i<sb1.length();i++){
            int index=sb2.indexOf(String.valueOf(sb1.charAt(i)));
            if(index==-1){
                return false;
            }else{
                sb2.deleteCharAt(index);
            }
        }
        return true;
    }
}
