package mayLeetCode;

public class MaximumSumCircularSubarray {
	public int maxSubarraySumCircular(int[] A) {
        int flag=0;
        int maxneg=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]>0){
                flag=1;
                break;
            }
            if(A[i]>maxneg){
                maxneg=A[i];
            }
        }
        if(flag==0){
            return maxneg;
        }
        int kadanesum=kadane(A);
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            A[i]=-A[i];
        }
        sum=sum+kadane(A);
        return Math.max(sum,kadanesum);
        
    }
    public int kadane(int[] a){
        int sum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum<0){
                sum=0;
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
    }

}
