package Matrix;

import java.util.HashSet;
import java.util.*;

class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowset = new HashSet<>();
        Set<Integer> colset = new HashSet<>();
        for(int i =0 ;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length; j++){
                if(matrix[i][j] == 0 ){
                    rowset.add(i);
                    colset.add(j);
                }
            }
        }
      
     
            for(int i : rowset){
                for(int r = 0;r<matrix[0].length ;r++){
                    matrix[i][r] = 0;
                }
            }
            for(int i : colset){
                for(int c =0 ;c<matrix.length ; c++){
                    matrix[c][i] = 0;
                }
            }
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix.length ;i++){
            
            for(int j =0;j<matrix[i].length; j++){
                list.add(matrix[i][j]);
            }
            result.add(list);
            list.clear();
        }
        
    }
}