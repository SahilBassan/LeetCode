// <a href = "https://www.youtube.com/watch?v=hTM3phVI6YQ"> NeetCode </a>

class Solution {
    public int maxDepth(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depth = new Stack<>();
        stack.push(root);
        depth.push(1);
        int res = 0;

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            int d = depth.pop();
            if(node != null){
                res = Math.max(res , d);
                stack.push(node.left);
                depth.push(d + 1);
                stack.push(node.right);
                depth.push(d + 1);
            }
        }
        return res;
    }
}



/* 
//using recursive Depth First Search
public int maxDepth(TreeNode root) {
    //base case
    if(root == null) return 0; 
    return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right));
} 
*/


/* 
//using iterative Breadth First Search

public int maxDepth(TreeNode root) {
        //if root is null depth is 0
        if(root == null) return 0; 

        // Because for iterative BFS Queue is used
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
                for(int i=0; i<size; i++){
                    TreeNode n = queue.poll();
                    if(n.left != null ) queue.add(n.left);
                    if(n.right != null) queue.add(n.right);
                }
            level++;
        }
        return level;
} 

*/






