import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
      int[] nums =  new int[9];
      for(int i=0;i<9;i++){
        nums[i]=i+1;
      }
      List<List<Integer>> res =  new ArrayList<List<Integer>>();
      sum3(new ArrayList<Integer>(), res, nums, k, n, 0);
      return res;
    }

    public void sum3(List<Integer> in,List<List<Integer>> out,int[] nums,int k,int n, int start){
      if (n<0){
        return;
      }
      if(in.size()==k&&n==0){
        out.add(new ArrayList<Integer>(in));
      }else{
        for (int i=start;i<nums.length;i++){
          in.add(nums[i]);
          sum3(in,out,nums,k,n-nums[i],i+1);
          in.remove(in.size()-1);
        }
      }
    }
}
