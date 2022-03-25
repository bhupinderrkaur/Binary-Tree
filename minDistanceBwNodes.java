class GfG {
    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca=lca(root,a,b);
        return dist(lca,a,0)+dist(lca,b,0);
    }
    Node lca(Node root,int a,int b){
        if(root==null)return null;
        if(root.data==a||root.data==b) return root;
        Node left=lca(root.left,a,b);
        Node right=lca(root.right,a,b);
        if(left!=null&&right!=null)return root;
        if(left!=null)return left;
        else return right;
    }
    int dist(Node root,int tar,int level){
        if(root==null)return Integer.MAX_VALUE;
        if(root.data==tar)return level;
        return Math.min(dist(root.left,tar,level+1),dist(root.right,tar,level+1));
    }
}
