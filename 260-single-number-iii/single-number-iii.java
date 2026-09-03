class Solution {
    public int[] singleNumber(int[] nums) {
       int XOR=0;
       for(int a: nums){
       XOR^=a;
       } 
       XOR= (XOR&XOR-1)^XOR;
       int num1=0;
       int num2=0;
       for(int a:nums){
        if((a&XOR)!=0){
            num1^=a;
        }
        else{
            num2^=a;
        }
       }
       return new int[]{num1,num2};
    }
}