class Solution {
    public int firstMissingPositive(int[] nums) {
        /*
            neg = 2
            n(n+1) / 2
            3

            positive = 0
            pos = 3
            6

            min = 1
            if min >1 return 1
            max = 6
            actual: 21
            got: 22 

            got > actual: duplicate 
            n = max + 1

            max = 4
            min = 1
            ac= 10

        */

        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i<nums.length; i++) {
            if(nums[i] > 0) {
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
            }
        }
        
        if(min > 1)
            return 1;

        if(nums.length == 1 && nums[0] == 1)
            return 2;

        for(int i = 0; i<nums.length; i++) {

            if(nums[i] <= 0)
                continue;

            if(nums[i] >= nums.length)
                continue;
            int ind = nums[i]; //1
            int temp = nums[ind]; //2
            nums[ind] = ind; // 1, 1 ,2
            while(temp >= i &&  temp > 0 && temp < nums.length && nums[temp] != temp) {
                // if(temp <= 0 || temp >= nums.length )
                //     continue;
                
                int t = nums[temp];
                nums[temp] = temp; 
                temp = t;
            }
         
        }

        for(int i =1; i<nums.length; i++) {
            if(nums[i] != i)
                return i;
        }

        return (max == nums.length) ? nums.length + 1: nums.length;
        // return nums.length;
    }
}