class Tree
{
    
    //Basically check height and compare right and left to see if diff>1 
   // int height;
   boolean res = true;
   int balanced(Node root){
       if(root==null) return 0; //if null no height
    if(root.left==null && root.right==null) return 1; //if leaf 1 height
    
    int ls = balanced(root.left);
    int rs = balanced(root.right);
    int r = Math.abs(ls-rs); 
    if(r>1) res =  false; //not balanced
    return Math.max(ls,rs)+1;
   }
   boolean isBalanced(Node root)
   {
    balanced(root);
    return res;
	
    }
}
