class Solution {
    public double minPrice(int[] prices, int[] discounts) {
     Arrays.sort(prices);
     Arrays.sort(discounts);
     int j=discounts.length-1,i=prices.length-1;
     double min=0;
     while(j>=0&&i>=0){
    min+=(double)(prices[i]*(100-discounts[j]))/100;
    i--;
    j--;
   }
   while(i>=0){
    min+=prices[i];
    i--;
   }
   return min;
    }
}