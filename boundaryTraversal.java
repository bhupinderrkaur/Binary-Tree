class Solution
{
    ArrayList<Integer> a=new ArrayList<>();
	ArrayList <Integer> boundary(Node node)
	{
	    if(node==null) return a;
	    a.add(node.data);
	    Printleft(node.left);
	    PrintLeaves(node.left);
	    PrintLeaves(node.right);
	    Printright(node.right);
	    return a;
	    
	}
	void Printleft(Node node){
	    if(node==null) return;
	    if(node.left!=null) {
	        a.add(node.data);
	        Printleft(node.left);
	    }
	    else if(node.right!=null){
	        a.add(node.data);
	        Printleft(node.right);
	    }
	}
	void Printright(Node node){
	    if(node==null) return;
	    if(node.right!=null){
	        Printright(node.right);
	        a.add(node.data);
	    }
	    else if(node.left!=null){
	        Printright(node.left);
	        a.add(node.data);
	    }
	}
	void PrintLeaves(Node node){
	    if(node==null) return;
	    PrintLeaves(node.left);
	    if(node.left==null && node.right==null){
	        a.add(node.data);
	    }
	    PrintLeaves(node.right);
	}
}
