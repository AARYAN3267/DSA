class Solution {
    public int fun(int num) {
int cn=0;
        while (num >= 100) {
            int a = num % 10;
            int b = (num / 10) % 10;
            int c = (num / 100) % 10;
            if ((b > a && b > c) || (b < a && b < c))
                cn++;
            num /= 10;
        }
        return cn;
    }

    

    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int i = num1; i <= num2; i++) {
            if (i < 100)
                continue;
           ans+= fun(i);
        }
        return ans;
    }}
