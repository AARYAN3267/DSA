class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>list= new ArrayList<>();
        int []arr= new int[101];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            arr[nums[i]]+=1;;
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=min;i<max;i++){
            if(arr[i]==0)list.add(i);
        }
        return list;
    }
}