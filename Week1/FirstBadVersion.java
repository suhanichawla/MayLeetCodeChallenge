package mayLeetCode;


import java.util.ArrayList;

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class FirstBadVersion {
	
	public int firstBadVersion(int n) {
        int i=0;
        int j=n;
        ArrayList<Integer> arr=new ArrayList<>();
        while(i<=j){
            int mid=i + (j - i) / 2;
            if(isBadVersion(mid)){
                arr.add(mid);
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return Collections.min(arr);
    }

}
