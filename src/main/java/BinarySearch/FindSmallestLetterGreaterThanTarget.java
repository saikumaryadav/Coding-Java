package BinarySearch;

class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
    
        while(left <= right){
            int mid = (left + right) / 2;
             if(target < letters[mid]){
                right = mid -1 ;
            }
            else{
                left = mid + 1;
            }
        }
        return letters[left% letters.length ];
    }
}