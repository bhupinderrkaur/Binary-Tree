class Solution
{
    int leaflevel;
    boolean check(Node root)
    {
	  return check(root, 1);
    }
    boolean check(Node root, int level){
        if(root==null) return true;
        if(root.left==null && root.right==null){
            if(leaflevel==0){
            leaflevel=level;
            return true;
            }
            return level==leaflevel;
        }
        return check(root.left,level+1) && check(root.right,level+1);
    }
}
