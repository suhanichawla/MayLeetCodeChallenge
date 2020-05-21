package mayLeetCode;

public class KthSmallestElementInABST {
	public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> inorder = new LinkedList<TreeNode>();

        while (true) {
          while (root != null) {
            inorder.add(root);
            root = root.left;
          }
          root = inorder.removeLast();
          if (--k == 0) return root.val;
          root = root.right;
        }
    }

}
