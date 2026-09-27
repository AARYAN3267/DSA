class Solution {
    public String reverseParentheses(String s) {
      Stack<Character> st= new Stack<>();
      for(char a:s.toCharArray()) {
  
  if(a==')'){
    StringBuilder sb= new StringBuilder();
    while(!st.isEmpty()&&st.peek()!='('){
        sb.append(st.pop());
    }
    if(!st.isEmpty()){
      st.pop();
    }
    for(int i=0;i<sb.length();i++){
        st.push(sb.charAt(i));
    }
  }
  else{
    st.push(a);
  }
  }
  StringBuilder sb= new StringBuilder();
  while(!st.isEmpty())sb.append(st.pop());
   return sb.reverse().toString(); 
    }
}