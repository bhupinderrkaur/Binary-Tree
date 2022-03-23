
class Solution
{
    
    static ArrayList<Integer> topView(Node node)
    {
        ArrayList<Integer> a=new ArrayList<>();
       class Queueobj{
           Node node;
           int hd;
           Queueobj(Node node, int hd){
               this.node=node;
               this.hd=hd;
           }
       }
       Queue<Queueobj> q=new LinkedList<>();
       Map<Integer,Integer> m=new TreeMap<>();
       if(node==null)
       return a;
       
       q.add(new Queueobj(node,0));
       while(!q.isEmpty()){
           Node temp=q.peek().node;
           int d=q.peek().hd;
           q.remove();
           
           if(!m.containsKey(d))
           m.put(d,temp.data);
           
           if(temp.left!=null) q.add(new Queueobj(temp.left,d-1));
           if(temp.right!=null) q.add(new Queueobj(temp.right,d+1));
       }
            for (Integer e:m.values()){
           a.add(e);
       }
       
      return a;  
    }
}
