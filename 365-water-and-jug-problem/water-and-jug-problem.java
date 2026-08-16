class Solution {
    public boolean dfs(int a, int b, int x,int y,int target, HashSet<String>map){
        if(a+b==target)return true;
        String s= a+","+b;
        if(map.contains(s))return false;
        map.add(s);
        if(dfs(x,b,x,y,target,map))return true;
        if(dfs(a,y,x,y,target,map))return true;
        if(dfs(0,b,x,y,target,map))return true;
        if(dfs(a,0,x,y,target,map))return true;
        int aToB=Math.min(a,y-b);
        if(dfs(a-aToB,b+aToB,x,y,target,map))return true;
        int bToA=Math.min(b,x-a);
        if(dfs(a+bToA,b-bToA,x,y,target,map))return true;
        return false;
    }
    public boolean canMeasureWater(int x, int y, int target) {
        HashSet<String>map= new HashSet<>();
        if(x+y<target)return false;
        return dfs(0,0,x,y,target,map);
    }
}