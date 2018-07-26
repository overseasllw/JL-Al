class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
      HashMap<Integer,Integer> group = new HashMap<>();

      for(int i=0;i<matrix.length;i++){
        for (int j=0;j<matrix[0].length;j++){
          if(!group.containsKey(i-j)){
            group.put(i-j,matrix[i][j]);
          }else{
            if(group.get(i-j)!=matrix[i][j]){
              return false;
            }
          }
        }
      }
      return true;
    }
}
