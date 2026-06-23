class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        Arrays.sort(costs);
        for(int a: costs){
            if(a<=coins){
                count++;
                coins-=a;
            }
        }
        return count;
    }
}