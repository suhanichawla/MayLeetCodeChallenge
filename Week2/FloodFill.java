package mayLeetCode;

public class FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor){
            return image;
        }
        int color=image[sr][sc];
         image[sr][sc]=newColor;
        floodfill(image,sr,sc,newColor,color);
        return image;
        
           
    }
    public int[][] floodfill(int[][] image, int sr, int sc, int newColor,int oldColor){
        if(sr>image.length || sc>image[0].length || sr<0 || sc<0){
            return image;
        }
        if(sc+1<image[0].length && image[sr][sc+1]==oldColor){
            image[sr][sc+1]=newColor;
            floodfill(image,sr,sc+1,newColor,oldColor);
        }
        if(sc-1>=0 && image[sr][sc-1]==oldColor){
            image[sr][sc-1]=newColor;
            floodfill(image,sr,sc-1,newColor,oldColor);
        }
        if(sr+1<image.length && image[sr+1][sc]==oldColor){
            image[sr+1][sc]=newColor;
            floodfill(image,sr+1,sc,newColor,oldColor);
        }
        if(sr-1>=0 && image[sr-1][sc]==oldColor){
            image[sr-1][sc]=newColor;
            floodfill(image,sr-1,sc,newColor,oldColor);
        }
        return image;
    }
}
