package mayLeetCode;

public class CousinsInBinaryTree {
	int depth=-1;
    TreeNode par;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(x==y){
            return true;
        }
        find(root,x,0);
        int depthx=depth;
        int parx;
        if(par!=null){
            parx=par.val;
        }else{
            parx=-1;
        }
        find(root,y,0);
        if(depthx==depth && parx!=par.val){
            return true;
        }else{
            return false;
        }
    }
    
    public void find(TreeNode root,int val,int h){
        if(root==null){
            return;
        }
        if((root.left!=null && root.left.val==val) || (root.right!=null && root.right.val==val)){
            par=root;
            depth=h;
            return;
        }
        find(root.left,val,h+1);
        find(root.right,val,h+1);
    }

}
