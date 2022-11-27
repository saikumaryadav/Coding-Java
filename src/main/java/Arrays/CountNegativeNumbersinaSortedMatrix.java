package Arrays;

class CountNegativeNumbersinaSortedMatrix {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for(int i=0;i<grid.length;i++){
            sum+= binarySearch(grid[i],0, grid[i].length-1);
        }
        return sum;
    }
    static int binarySearch(int[] arr, int start, int end){
        int mid =0;
            while(start <= end){
                mid = start + (end-start)/2;
                if(arr[mid] >= 0){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }
        return arr.length - (start);
    }
}