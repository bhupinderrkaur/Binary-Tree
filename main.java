Class Main{
public static void main(String args[])
    {
        // creating a binary tree and entering the nodes
        Node tree = new Node();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Function Call
  //varies from code to code change accordingly in place of 'function
       function(tree);
    }
}
