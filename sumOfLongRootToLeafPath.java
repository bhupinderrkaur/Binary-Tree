class Solution{
    int maxsum=0; int maxlevel=0;
    public int sumOfLongRootToLeafPath(Node root)
    {
        return sumf(root,1,0);
    }
    public int sumf(Node root,int level,int sum){
        if(root==null) return 0;
        sum+=root.data;
        sumf(root.left,level+1,sum);
        sumf(root.right,level+1,sum);
        if(maxlevel<level){
            maxlevel=level;
            maxsum=sum;
        }
        if(maxlevel==level){
            maxsum=Math.max(maxsum,sum);
        }
       return maxsum; 
    }
}
