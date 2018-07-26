import java.util.*;
class Solution {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
      int[] result = new int[nums.length];
      int start = 0;
      int end = nums.length-1;
      for(int i=0;i<nums.length;i++){
        int startSum = getSum(nums[start],a,b,c);
        int endSum = getSum(nums[end],a,b,c);
        if (a<0){
          result[i]=Math.min(startSum,endSum);
          if(startSum<=endSum){
            start++;
          }else{
            end--;
          }
        }else{
          result[nums.length-1-i]=Math.max(startSum,endSum);
          if (startSum<endSum){
            end--;
          }else{
            start++;
          }
        }
      }
      return result;
    }
    public int getSum(int x,int a,int b,int c){
      return x*x*a+b*x+c;
    }
  }
