class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
      Queue<Node> q=new LinkedList<>();
      ArrayList <Integer> arr=new ArrayList<>();
      q.add(node);
      while(q.size()>0){
          Node temp=q.remove();
          arr.add(temp.data);
          
          if(temp.left!=null)
          q.add(temp.left);
          if(temp.right!=null)
          q.add(temp.right);
         
             
              
       
          
      }
      return arr;
    }
}
