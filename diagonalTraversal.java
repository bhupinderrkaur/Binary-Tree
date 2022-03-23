class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
       ArrayList<Integer>ans=new ArrayList<Integer>();
       Queue<Node>q=new LinkedList<Node>();
       if(root==null){
           return ans;
       }
       q.add(root);
       while(!q.isEmpty()){
           Node t=q.peek();
           q.poll();
           while(t!=null){
               if(t.left!=null){
               q.add(t.left);
                }
               ans.add(t.data);
               t=t.right;
           }
       }
       return ans;
      } 
    }
