class Solution
{
   Node head=null;
   Node prev=null;
    Node bToDLL(Node node)
    {
	    if(node==null)
	    return node;
	    
	    bToDLL(node.left);
	    if(prev==null)
	    {
	        head=node;
	        prev=node;
	    }
	    else{
	    node.left=prev;
	    prev.right=node;
	    prev=node;
	    }
	    
	    
	   bToDLL(node.right);
	   return head;
    }
}
