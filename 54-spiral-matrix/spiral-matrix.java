class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowbegin = 0;
        int rowend = matrix.length-1;
        int colbegin = 0;
        int colend = matrix[0].length-1;

        ArrayList<Integer> arr = new ArrayList<>();

        while(rowbegin<=rowend && colbegin<=colend){
            for(int j=colbegin; j<=colend; j++){
                arr.add(matrix[rowbegin][j]);
            }
            rowbegin++;

            for(int j=rowbegin; j<=rowend; j++){
                arr.add(matrix[j][colend]);
            }
            colend--;

            if(rowbegin<=rowend){
                for(int j=colend; j>=colbegin; j--){
                    arr.add(matrix[rowend][j]);
                }
            }
            rowend--;

            if(colbegin<=colend){
                for(int j=rowend; j>=rowbegin; j--){
                    arr.add(matrix[j][colbegin]);
                }
            }
            colbegin++;
        }
        return arr;
    }
}