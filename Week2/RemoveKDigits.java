package mayLeetCode;

public class RemoveKDigits {
	public String removeKdigits(String num, int k) {
        for(int i=0;i<k;i++){
            num=helper(num);
        }
        return num;
        
    }
    public String helper(String prev){
        int length = prev.length();
        int index = length - 1;
        for (int i = 0; i < index; i++) {
            if (prev.charAt(i) > prev.charAt(i + 1)) {
                index = i;
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<length;i++){
            if (sb.length() == 0 && prev.charAt(i) == '0' || i == index){
                continue;
            }
            sb.append(prev.charAt(i));
        }
        return sb.length()==0? "0" : sb.toString();

    }

}
