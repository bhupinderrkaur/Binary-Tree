class Solution{
    public void toSumTree(Node root){
       sumt(root);
    }
    public int sumt(Node root){
        if(root==null) return 0;
        
        
        int stored=root.data;
        root.data=sumt(root.left)+sumt(root.right);
        return root.data+stored;
    }
}
