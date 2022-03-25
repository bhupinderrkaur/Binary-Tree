
class Solution
{
static Node temp = null;
static int k;
 
static Node kthAncestor(Node root, int node)
{
    if (root == null)
        return null;
     
    if (root.data == node||
    (temp = kthAncestor(root.left,node)) != null ||
    (temp = kthAncestor(root.right,node)) != null)
    {
        if (k > 0)    
            k--;
         
        else if (k == 0)
        {
            System.out.print("Kth ancestor is: "+root.data);
             
            return null;
        }
        return root;
    }
    return null;
}
}
