class BTree
{
   //recursive
    public static void preorder(Node root)
    {
        // return if the current node is empty
        if (root == null) {
            return;
        }
    
        
        System.out.print(root.data + " ");
    
        // Traverse the left subtree
        preorder(root.left);
    
        // Traverse the right subtree
        preorder(root.right);
    }
