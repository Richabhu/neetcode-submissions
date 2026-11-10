class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        for(int i = 0; i< nums.length; i++) {
            
            int target = -nums[i];
            int l = i+1, r = nums.length -1;
            while(l < r) {
                int currSum = nums[l] + nums[r];

                if(currSum == target) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    
                }
                else if(currSum > target)
                    r--;
                else
                    l++;
            }
        }
        return new ArrayList<>(res);
    }
}
