package mayLeetCode;

public class CountingBits {
	public int[] countBits(int num) {
	       int[] arr=new int[num+1];
	        for(int i=0;i<=num;i++){
	             int count=0;
	            int numcpy=i;
	            while(numcpy!=0){
	                count+=numcpy&1;
	                numcpy=numcpy>>1;
	            }
	            arr[i]=count;
	        }
	        return arr;
	        
	    }

}
