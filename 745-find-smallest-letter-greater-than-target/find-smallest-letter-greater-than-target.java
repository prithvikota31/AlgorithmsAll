class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //binary search
        int low = 0;
        int high = letters.length - 1;

        int result = Integer.MAX_VALUE;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            int c = letters[mid] - 'a';
            if(c > target - 'a')
            {
                result = Math.min(result, c);
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return result == Integer.MAX_VALUE? letters[0] : (char)(result + 'a'); 
    }
}