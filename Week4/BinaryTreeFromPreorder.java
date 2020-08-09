package mayLeetCode;

public class BinaryTreeFromPreorder {
	public TreeNode bstFromPreorder(int[] preorder) {
	       TreeNode root=new TreeNode(preorder[0]);
	       for(int i=1;i<preorder.length;i++){
	           addNode(root,preorder[i]);
	       }
	       return root;
	    }
	    private void addNode(TreeNode node, int item) {
			if(item>node.val) {
				if(node.right==null) {
					TreeNode nn=new TreeNode(item,null,null);
					node.right=nn;
				}else {
					addNode(node.right,item);
				}
			}else {
				if(node.left==null) {
					TreeNode nn=new TreeNode(item,null,null);
					node.left=nn;
				}else {
					addNode(node.left,item);
				}
			}
			
		}

}
