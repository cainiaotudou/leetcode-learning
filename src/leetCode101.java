/*
给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3
但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3
 */
public class leetCode101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public boolean symmetric(TreeNode root1,TreeNode root2){
        if(root1==null&& root2==null){
            return true;
        }
        if(root1!=null&root2!=null&&root1.val==root2.val){
            return symmetric(root1.left,root2.right)&&symmetric(root1.right,root2.left);
        }else{
            return false;
        }
    }
    public boolean isSymmetric(TreeNode root) {
      return symmetric(root,root);
    }
}
