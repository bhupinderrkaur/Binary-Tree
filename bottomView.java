class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node node)
    {
        // Code here
        ArrayList<Integer> a=new ArrayList<>();
        class Qobj{
            Node node;
            int hd;
            Qobj(Node node, int hd){
                this.node=node;
                this.hd=hd;
            }
            }
            Queue<Qobj> q=new LinkedList<>();
            Map<Integer,Integer> m=new TreeMap<>();
            q.add(new Qobj(node,0));
            while(!q.isEmpty()){
               Node temp=q.peek().node;
               int d=q.peek().hd;
               q.remove();
               //if(!m.containsKey(d)) coz treeMap dsnt store duplicates and sorts elements based on key so, treemap<hd, node.data> will be sorted acc to d 
               m.put(d,temp.data);
               if(temp.left!=null)
               q.add(new Qobj(temp.left,d-1));
               if(temp.right!=null)
               q.add(new Qobj(temp.right,d+1));
               
               
            }
            for(Integer r:m.values()){
                a.add(r);
            }
            return a;
        }
    }
