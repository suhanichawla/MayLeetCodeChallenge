package mayLeetCode;

public class SingleNonDuplicate {
	public int singleNonDuplicate(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            x=x^nums[i];
        }
        return x;
        
    }

}
