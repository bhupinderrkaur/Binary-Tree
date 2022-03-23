 node createNode(int val)
{
    node newNode = new node();
    newNode.val = val;
    newNode.left = null;
    newNode.right = null;
    return newNode;
}
 static node mirrortree(node root)
{
    if (root == null)
    {
        return null;
         
    }
 
   
    node mirror = createNode(root.val);
    mirror.right = mirrortree(root.left);
    mirror.left = mirrortree(root.right);
    return mirror;
}
 public static void main(String args[])
{
 
    node tree = createNode(1);
    tree.left = createNode(2);
    tree.right = createNode(4);
    tree.left.left = createNode(3);
    tree.left.right = createNode(7);
 
   
    node mirror = null;
    mirror = mirrortree(tree);
 
}
