class Solution {
    public List<String> maxNumOfSubstrings(String s) {
//     int firstoc[]= new int[26];
//     int lastoc[]= new int[26];
//     Arrays.fill(firstoc,-1);
//     Arrays.fill(lastoc,-1);
//     for(int i=0;i<s.length();i++){
//         int c= s.charAt(i)-'a';
//         if(firstoc[c]==-1)firstoc[c]=i;
//         lastoc[c]=i;
//     }
//     List<int []>list= new ArrayList<>();
//     for(int i=0; i<26;i++){
//         if(firstoc[i]==-1)continue;
//         int l=firstoc[i];
//         int r= lastoc[i];
//         boolean isval=true;
//         for(int j=l;j<l;j++){
//             int c= s.charAt(j)-'a';
//             if(firstoc[c]<l){
//                 isval=false;
//                 break;
//             }
//             r=Math.max(r,lastoc[r]);
//         }
//         if(isval){
//             list.add(new int[]{l,r});
//         }
//     }
// List<String>ans= new ArrayList<>();
// list.sort((a,b)-> Integer.compare(a[1],b[1]));
// int i=-1;
// for(int arr[]:list){
// int l=arr[0];
// int r= arr[1];
// if(l>i){
//     ans.add(s.substring(l,r+1));
//     i=r;
// }
// }
// return ans;


int n = s.length();
        int[] left = new int[26];
        int[] right = new int[26];
        Arrays.fill(left, -1);
        Arrays.fill(right, -1);

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            if (left[c] == -1) left[c] = i;
            right[c] = i;
        }

        List<int[]> validIntervals = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            if (left[i] == -1) continue;

            int l = left[i];
            int r = right[i];
            boolean isValid = true;

            for (int j = l; j <= r; j++) {
                int c = s.charAt(j) - 'a';
                if (left[c] < l) {
                    isValid = false;
                    break;
                }
                r = Math.max(r, right[c]);
            }

            if (isValid) {
                validIntervals.add(new int[]{l, r});
            }
        }

        // Sort strictly by interval length (right - left)
        validIntervals.sort((a, b) -> Integer.compare(a[1] - a[0], b[1] - b[0]));

        List<String> result = new ArrayList<>();
        List<int[]> chosen = new ArrayList<>();

        for (int[] interval : validIntervals) {
            int l = interval[0], r = interval[1];
            boolean overlaps = false;

            for (int[] c : chosen) {
                if (!(r < c[0] || l > c[1])) {
                    overlaps = true;
                    break;
                }
            }

            if (!overlaps) {
                chosen.add(interval);
                result.add(s.substring(l, r + 1));
            }
        }

        return result;

    }
}