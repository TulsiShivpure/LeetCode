class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    private int preIndex = 0; 
    private int postIndex = 0; 
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return buildTree(preorder, postorder);
    }
    private TreeNode buildTree(int[] preorder, int[] postorder) {
        TreeNode root = new TreeNode(preorder[preIndex]);
        preIndex++;

        if (root.val != postorder[postIndex]) {
            root.left = buildTree(preorder, postorder);
        }

        if (root.val != postorder[postIndex]) {
            root.right = buildTree(preorder, postorder);
        }

        postIndex++;

        return root;
    }
}