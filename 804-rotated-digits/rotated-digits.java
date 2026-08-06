class Solution {
    public int rotatedDigits(int n) {
       int dp[]= new int[n+1];
       int count=0;
       for(int i=0; i<=n;i++){
        if(i<10){
            if(i==0||i==1||i==8)dp[i]=1;
            else if(i==2||i==5||i==6||i==9){dp[i]=2;count++;}
            else{dp[i]=-1;}
        }else{
            int pre=dp[i/10];
            int suf=dp[i%10];
            if(pre==-1||suf==-1){dp[i]=-1;}
            else if(pre==2||suf==2){count++;
            dp[i]=2;}
            else{
                dp[i]=1;
            }
        }
       }
       return count; 
    }
}