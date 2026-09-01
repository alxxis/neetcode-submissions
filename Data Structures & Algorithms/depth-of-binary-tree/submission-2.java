/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        Stack<Pair<TreeNode,Integer>> stack = new Stack<>();
        if(root==null) return 0;
        int maxDepth = 1;
        stack.push(new Pair<>(root,1));
        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> current = stack.pop();
            if(current.getKey().left!=null)
                stack.push(new Pair<>(current.getKey().left, current.getValue()+1));
            if(current.getKey().right!=null) 
                stack.push(new Pair<>(current.getKey().right, current.getValue()+1));
            maxDepth = Math.max(maxDepth, current.getValue());
        }
        return maxDepth;
    }
}
