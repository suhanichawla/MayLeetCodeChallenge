package mayLeetCode;

import java.util.HashMap;

public class FindTheTownJudge {
	public int findJudge(int N, int[][] trust) {
        if(N==1 && trust.length==0){
            return 1;
        }
        if(trust.length<N-1){
            return -1;
        }
        HashMap<Integer,Integer> hp=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int val=0;
        for(int i=0;i<trust.length;i++){
            if(!hp.containsKey(trust[i][1])){
                hp.put(trust[i][1],1);
            }else{
                hp.put(trust[i][1],hp.get(trust[i][1])+1);
            }
            if(hp.get(trust[i][1])>val){
                max=trust[i][1];
                val=hp.get(max);
            }
        }
        if(val!=N-1){
            return -1;
        }
        for(int i=0;i<trust.length;i++){
            if(trust[i][0]==max){
                return -1;
            }
        }
        return max;
        
    }

}
