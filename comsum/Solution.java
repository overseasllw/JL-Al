import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
      CSum(new ArrayList<Integer>(),result,candidates,target,0);
      return result;
    }
    public void CSum(List<Integer> in,List<List<Integer>> out,int[] candidates,int target,int start){
      if (target<0){
        return;
      }
      if(target==0){
        out.add(new ArrayList<Integer>(in));
      }
      for(int i=start;i<candidates.length;i++){
        in.add(candidates[i]);
        CSum(in,out,candidates,target-candidates[i],i);
        in.remove(in.size()-1);
      }
    }
}
