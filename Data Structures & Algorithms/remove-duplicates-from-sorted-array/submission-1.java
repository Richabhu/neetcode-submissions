class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 1; 
        int r = 1;

        while( r < nums.length) {
            if( nums[r] == nums[l-1])
            {
                r++;
                continue;
            }
            nums[l]= nums[r];
            r++;
            l++;
        }
        return l;
    }
}