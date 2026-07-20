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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Deque<TreeNode> queue = new ArrayDeque<>(); 
        if(root == null) return new ArrayList<>();
        queue.offer(root);

        List<List<Integer>> list = new ArrayList<>();


    while(!queue.isEmpty()){

        List<Integer> currentLevel = new ArrayList<>();

        int levelSize = queue.size();

        for(int i = 0; i < levelSize; i++){

            TreeNode node = queue.poll();

            System.out.print(currentLevel.add(node.val));

            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
        }
        list.add(currentLevel);
    }
        return list;
    }
}