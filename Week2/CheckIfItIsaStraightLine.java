package mayLeetCode;

public class CheckIfItIsaStraightLine {
	 public boolean checkStraightLine(int[][] coordinates) {
	        if(coordinates.length==2){
	            return true;
	        }
	        //find line
	        float slope=(float)Math.abs(coordinates[0][1]-coordinates[1][1])/Math.abs(coordinates[0][0]-coordinates[1][0]);
	        for(int i=2;i<coordinates.length;i++){
	            if((float)Math.abs(coordinates[i][1]-coordinates[0][1])/Math.abs(coordinates[i][0]-coordinates[0][0])!=slope){
	                return false;
	            }
	        }
	        return true;
	        
	        
	    }
}
