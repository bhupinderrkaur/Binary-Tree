

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> a=new ArrayList<Integer>();
        Stack<Node> st=new Stack<>();
        Queue<Node> q = new LinkedList<>();
         q.add(node);
        while(q.size()>0){
            
            node=q.peek();
            q.remove();
            st.add(node);
            
            if(node.right!=null)
            q.add(node.right);
            if(node.left!=null)
            q.add(node.left);
        }
        while(!st.isEmpty()){
            Node t=st.pop();
            a.add(t.data);
        }
        return a;
    }
}      
