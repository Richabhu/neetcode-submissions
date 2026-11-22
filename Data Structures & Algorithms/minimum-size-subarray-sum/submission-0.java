class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;

        int min = nums.length + 1;
        int s = 0;
        for(int r = 0; r < nums.length; r++) {

            s += nums[r];
            boolean flag = false;
            while(s >= target) {
                s -= nums[l];
                l++;
                flag = true;
                
            }
            if(flag)
            {
                l--;
                s += nums[l];
            }
            if(s >= target)
                min = Math.min(min, r-l+1);

        }

        return (min == nums.length + 1) ? 0: min;
    }
}