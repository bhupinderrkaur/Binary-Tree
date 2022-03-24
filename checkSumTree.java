class Solution
{
    boolean flag=true;
    
    int sumt(Node root){
        
     if(root==null) return 0;
     if(root.left==null && root.right==null) return root.data;
   
     
     int ls=sumt(root.left);
     int rs=sumt(root.right);
     if(root.data!=ls+rs){
         flag=false;
     }
     return root.data+ls+rs; 
     
     
    }
	boolean isSumTree(Node root)
	{
             flag=true;
             sumt(root);
             return flag;
	}
}
