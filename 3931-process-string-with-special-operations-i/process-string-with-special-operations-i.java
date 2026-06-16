class Solution {
    public String processStr(String s) {
        StringBuilder sb= new StringBuilder();
        for(char a: s.toCharArray()){
            if(a=='*'){
                if(sb.length()==0)continue;
                sb.deleteCharAt(sb.length()-1);}
            else if(a=='#'){
                String k= sb.toString();
                sb.append(k);
            }
            else if(a=='%')sb=sb.reverse();
            else{ sb.append(a);}
        }
      return  sb.toString();
    }
}