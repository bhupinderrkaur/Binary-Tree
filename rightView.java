class Solution{
    int max;
    ArrayList<Integer> a=new ArrayList<>();
    ArrayList<Integer> rightView(Node node) {
       return rightView(node,1);
    }
    ArrayList<Integer> rightView(Node root, int level){
        if(root==null) return a;
        
        if(level>max){
            a.add(root.data);
            max=level;
        }
        rightView(root.right,level+1);
        rightView(root.left,level+1);
        
        return a;
    }
}
