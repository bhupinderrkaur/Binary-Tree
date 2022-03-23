class Tree
{
   
    int max;
    ArrayList<Integer> a=new ArrayList<Integer>();
    ArrayList<Integer> leftView(Node root){
        return leftView(root,1);
    }
    ArrayList<Integer> leftView(Node root,int level)
    {
      
      if(root==null) return a;
      if(level>max){
          a.add(root.data);
          max=level;
      }
      leftView(root.left,level+1);
      leftView(root.right,level+1);
      
      
      return a;
    }
}
