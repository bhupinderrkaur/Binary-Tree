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
        
    
    
    //iterative method
 public static void inorderIterative(Node root)
    {
       
        Stack<Node> stack = new Stack<>();
    
       
        Node curr = root;
    
 
        while (!stack.empty() || curr != null)
        {
           
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else {
                // otherwise, if the current node is null, pop an element from
                // the stack, print it, and finally set the current node to its
                // right child
                curr = stack.pop();
                System.out.print(curr.data + " ");
    
                curr = curr.right;
            }
        }
    }
 
