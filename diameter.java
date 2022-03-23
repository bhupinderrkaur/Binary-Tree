class Solution {
    // Function to return the diameter of a Binary Tree.
    int dia=0;
    int diameter(Node node) {
       if(node==null) return 0;
       if(node.left==null && node.right==null) return 1;
       
        int lh= height(node.left);
       int rh= height(node.right);
       int ld= diameter(node.left);
       int rd= diameter(node.right);
       return Math.max(lh+rh+1, Math.max(ld,rd)); //height
}
static int height(Node node)
    {
        // base case tree is empty
        if (node == null)
            return 0;
        return (1
                + Math.max(height(node.left),
                           height(node.right)));
    }
}
