class Solution {
    public String findLongestWord(String s, List<String> d) {
      String maxString = "";
      for(String str:d){
        if(isSubsequence(str, s)){
          if(str.length()>maxString.length()||(str.length()==maxString.length()&&str.compareTo(maxString) < 0)){
            maxString=str;
          }
        }
      }
      return maxString;
    }
    public boolean isSubsequence(String a,String b){
      int j=0;
      for(int i=0;i<b.length()&&j<a.length();i++){
        if(a.charAt(j)==b.charAt(i)){
          j++;
        }
      }
      return j==a.length();
    }
}
