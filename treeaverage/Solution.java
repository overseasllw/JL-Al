
 //* Definition for a binary tree node.
 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
      List<Double> sum = new ArrayList<Double>();
      ArrayList<Integer> count = new ArrayList<Integer>();
      getAverage(root, 0, sum, count);
      for(int i=0;i<sum.size();i++){
        sum.set(i,sum.get(i)/count.get(i));
      }
      return sum;
    }

    public void getAverage(TreeNode node,int level,List<Double> sum,ArrayList<Integer> count){
      if (node==null){
        return;
      }
      if(level<sum.size()){
        sum.set(level,sum.get(level)+node.val);
        count.set(level,count.get(level)+1);
      }else{
        sum.add(node.val*1.0);
        count.add(1);
      }
      getAverage(node.left, level+1, sum, count);
      getAverage(node.right, level+1, sum, count);
    }
}
