package mayLeetCode;

public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
        if(num==0){
            return false;
        }
        if(num==1){
            return true;
        }
        long lo=0,hi=num/2;
        while(lo<=hi){
            long mid=(lo+hi)/2;
            if((mid*mid)==num){
                return true;
            }else if((mid*mid)<num){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
            
        }
        return false;
    }

}
