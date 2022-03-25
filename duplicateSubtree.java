class Solution { 
    String solve(Node root,Map<String,Integer> map){
        if(root==null) return "";
        String s=solve(root.left,map)+"#"+root.data+"#"+solve(root.right,map);
        if(root.left!=null||root.right!=null)
        map.put(s,map.getOrDefault(s,0)+1);
        return s;
    }
    
    
    int dupSub(Node root) {
    Map<String,Integer> map=new HashMap<>();
    solve(root,map);
    for(Map.Entry<String,Integer> e:map.entrySet()){
        if(e.getValue()>1) return 1;
    }
    return 0;
        
    }
}
