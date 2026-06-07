class Solution {
    public List<String> buildArray(int[] target, int n) {
      Stack<Integer> st= new Stack<>();
      List<String>list= new ArrayList<>();
      int j=0;
      for(int i=1; i<=n;i++){
        if(j>=target.length)break;
        st.push(i);
        list.add("Push");
        if(st.peek()==target[j]){
           j++;
        }
       else{
        st.pop();
        list.add("Pop");
       }
      }
 return list;
    }
}