package mayLeetCode;

public class IntervalListIntersections {
	public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> rv=new ArrayList<>();
        int i=0,j=0;
        while(i<A.length && j<B.length){
            int low=Math.max(A[i][0],B[j][0]);
            int hi=Math.min(A[i][1],B[j][1]);
            if(low<=hi){
                int[] arr= new int[2];
                arr[0]=low;
                arr[1]=hi;
                rv.add(arr);
            }
            if(A[i][1]<B[j][1]){
                i++;
            }else{
                j++;
            }
        }
        return rv.toArray(new int[rv.size()][]);
        
    }

}
