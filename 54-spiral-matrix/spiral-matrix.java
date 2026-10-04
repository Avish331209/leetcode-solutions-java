class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        if(matrix.length==0 || matrix[0].length==0){
            return result;
        }

        int rowLower=0;
        int rowUpper=matrix.length-1;
        int colLower=0;
        int colUpper=matrix[0].length-1;

        while(rowLower<=rowUpper && colLower<=colUpper){
            for(int i=colLower;i<=colUpper;i++){
                result.add(matrix[rowLower][i]);
            }
            rowLower++;

            for(int j=rowLower;j<=rowUpper;j++){
                result.add(matrix[j][colUpper]);
            }
            colUpper--;

            if(rowLower>rowUpper || colLower>colUpper){
                break;
            }

            for(int i=colUpper;i>=colLower;i--){
                result.add(matrix[rowUpper][i]);
            }
            rowUpper--;

            for(int j=rowUpper;j>=rowLower;j--){
                result.add(matrix[j][colLower]);
            }
            colLower++;
        }
        return result;
    }
}