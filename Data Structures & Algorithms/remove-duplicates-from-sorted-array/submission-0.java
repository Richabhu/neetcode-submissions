class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1; 
        int i = 1;

        while( i < nums.length) {
            if( nums[i] == nums[k-1])
            {
                i++;
                continue;
            }
            nums[k]= nums[i];
            i++;
            k++;
        }
        return k;
    }
}