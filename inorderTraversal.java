class Tree
{
    // Recursive function to perform inorder traversal on the tree
    public static void inorder(Node root)
    {
 
        if (root == null) {
            return;
        }
    
        // Traverse the left subtree
        inorder(root.left);
    
        System.out.print(root.data + " ");
    
        // Traverse the right subtree
        inorder(root.right);
    }
