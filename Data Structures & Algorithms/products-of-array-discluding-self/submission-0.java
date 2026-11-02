class Solution {

    public int[] productExceptSelf(int[] nums) {
        int prod = 1, nZero = 0;

        for(int n: nums){
            if( n!= 0)
                prod = prod * n;
            else
                nZero++;
        }

        int res[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++) {

            if(nZero == 0) {
                res[i] = prod / nums[i];
            }
            else if(nZero == 1) {
                if(nums[i] == 0)
                    res[i] = prod;
                else
                    res[i] = 0;
            }
            else
                res[i] = 0;
        }
        return res;

    }
}