import sun.plugin.javascript.navig.LinkArray;

import java.util.ArrayList;
import java.util.List;

/*
给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

例如：
给定二叉树 [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其自底向上的层次遍历为：

[
  [15,7],
  [9,20],
  [3]
]
 */
public class leetCode107 {
    public static void main(String[] args){
//        List a = new ArrayList();
//        a.add(0,1);
//        a.add(0,2);
//        a.add(0,3);
//        System.out.println(a);
        int x = 9/5;
        System.out.println(x);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null){
            return  res;
        }
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();
        list1.add(root);
        List<Integer> list3 = null;
        TreeNode temp= null;
        while(list1.size()!=0){
             list3 = new ArrayList<Integer>();
            for(int i =0;i < list1.size();i++){
                temp = list1.get(i);
                list3.add(temp.val);
                if(temp.left!=null){
                    list2.add(temp.left);
                }
                if(temp.right!=null){
                    list2.add(temp.right);
                }
            }
            list1=list2;
            list2=new ArrayList<>();
            res.add(0,list3);
        }
        return res;
    }
}
