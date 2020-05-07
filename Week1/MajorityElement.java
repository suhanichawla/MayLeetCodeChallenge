package mayLeetCode;

import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hp.containsKey(nums[i])){
                hp.put(nums[i],hp.get(nums[i])+1);
            }else{
                 hp.put(nums[i],1);
            }
        }
        for(Integer i:hp.keySet()){
            if(hp.get(i)>Math.abs(nums.length/2)){
                return i;
            }
        }
        return 0;
        
    }

}
