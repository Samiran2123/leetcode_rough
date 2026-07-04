class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n =matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<i;j++){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++){
           int k=0;
           int j=matrix[0].length-1;
            while(k<j){
               int temp= matrix[i][k];
               matrix[i][k]=matrix[i][j];
               matrix[i][j]=temp;
                k++;
                j--;
            }
        }
    }
}