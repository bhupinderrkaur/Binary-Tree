class Solution
{
    static int i = 0; //to traverse pre-order array
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        i = 0;
        return tree(inorder,preorder,0,n-1);
    }
    static Node tree(int inorder[], int preorder[], int start, int end){
	    
        if(start > end) return null;
        Node root = new Node(preorder[i++]);
	if(start==end) return root; 
	    
        int j; //inorder element index
        for(j=start;j<=end;j++)
            if(inorder[j] == root.data)
                break;
	    
        root.left = tree(inorder,preorder,start,j-1);
        root.right = tree(inorder,preorder,j+1,end);
        return root;
    }
}
