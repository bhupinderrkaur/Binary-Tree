class Btree
{
    
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> a=new ArrayList<>();
	    if(root==null) return a;
	    Stack<Node> curr=new Stack<>();
	    Stack<Node> next=new Stack<>();
	    curr.push(root);
	    boolean lr=true;
	    
	    while(!curr.isEmpty()){
	        Node temp=curr.pop();
	        a.add(temp.data);
	        if(lr){
	            if(temp.left!=null)
	            next.push(temp.left);
	            if(temp.right!=null)
	            next.push(temp.right);
	        }
	        else{
	            if(temp.right!=null)
	            next.push(temp.right);
	            if(temp.left!=null)
	            next.push(temp.left);
	        }
	        if(curr.isEmpty()){
	            lr=!lr;
	            Stack<Node> tempst=curr;
	            curr=next;
	            next=tempst;
	        }
	    }
	    return a;
	}
}
