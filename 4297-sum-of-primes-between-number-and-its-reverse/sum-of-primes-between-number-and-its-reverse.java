class Solution {
    private int reverse(int n){
        int a=0;
        while(n>0){
            int mod= n%10;
            a=(a*10)+mod;
            n/=10;
        }
        return a;
    }
    private boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
      int rev= reverse(n);
      int min= Math.min(rev,n);
      int sum=0;
      int max= Math.max(rev,n);
      for(int i=min;i<=max;i++){
        if(i==1)continue;
        if(isPrime(i))sum+=i;
      }
      return sum;
    }
}