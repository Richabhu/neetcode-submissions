class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        int n = nums.length;

        // [-5,-4,-3,-2,-1,0,0,1,2,3,4,5] , target = 0
        for(int i = 0; i<nums.length; i++) {

            if(i > 0 && nums[i] == nums[i-1])
                continue;

            for(int j = i+1; j<nums.length; j++) {

                if(j>i+1 && nums[j] == nums[j-1]) // [-5,-2,3,4]
                    continue;

                // int sum = target - (nums[i] + nums[j]);
                int left = j+1, right = nums.length -1; // 4 , 11

                while(left < right) {
                    long currSum = (long)nums[left] + (long)nums[right] + (long)nums[i] + (long)nums[j];
                    // System.out.println(currSum);
                    if(currSum == (long)target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        // right--;

                        while(left < right && nums[left] == nums[left-1])
                            left++;

                        while(left < right && nums[right] == nums[right-1])
                            right--;


                    }
                    else if(currSum > target) 
                        right--;
                    else
                        left++;
                }

            }
        }
        return res;
    }
}