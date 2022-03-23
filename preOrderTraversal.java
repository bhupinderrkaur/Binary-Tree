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
   
   
   
   //iterative
    public static void preorderIterative(Node root)
    {
      
        if (root == null) {
            return;
        }
    
      
        Stack<Node> stack = new Stack<>();
        stack.push(root);
    
        while (!stack.empty())
        {
            Node curr = stack.pop();
    
            System.out.print(curr.data + " ");
    
            
            if (curr.right != null) {
                stack.push(curr.right);
            }
    
           
            if (curr.left != null) {
                stack.push(curr.left);
            }
    
            // the right child must be pushed first so that the left child
            
        }
    }
