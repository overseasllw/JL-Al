public class Solution {

  public int Score(String str){
    int i =0;
    int j = str.length()-1;
    int score =0;
    while(i<j){
      if(str.charAt(i)!=str.charAt(j)){
         score +=2;
      }
      i++;
      j--;
    }
    return score;
  }
}
