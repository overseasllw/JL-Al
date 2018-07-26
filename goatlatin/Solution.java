class Solution {
    public String toGoatLatin(String S) {
      Set<Character> vowels = new HashSet<>();
      for(char c: new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}){
        vowel.add(c);
      }
      int countA = 1;
      StringBuilder  result = new StringBuilder();
      String[] words = S.split(" ");
      for (int i=0;i<words.length;i++){
        char first = words[i].charAt(0);
        if (vowels.contains(first)){
          result.append(words[i]);
        }else{
          result.append(words[i].subtring(1));
          result.append(words[i].substring(0,1));
        }
        result.append("ma");
        for (int i=0;i<countA;i++){
          result.append("a");
        }

        countA++;
        result.append(" ");
      }

      return result.toString().trim();
    }
}
