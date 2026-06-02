class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
    Arrays.sort(asteroids);
    long b= mass;
    boolean ans=true;
    for(int a: asteroids){
        if(b>=a)b+=a;
        else{return false;}
    }    
    return ans;
    }
}