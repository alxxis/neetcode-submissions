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
        if(root==null){
            return 0;
        }
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Pair<>(root, 1));
        int max = 0;
        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> temp = stack.pop();
            if(temp.getKey().right!=null){
                stack.push(new Pair<>(temp.getKey().right, temp.getValue()+1));
            }
            if(temp.getKey().left!=null){
                stack.push(new Pair<>(temp.getKey().left, temp.getValue()+1));
            }
            max = Math.max(max, temp.getValue());
        }
        return max;
    }
}
