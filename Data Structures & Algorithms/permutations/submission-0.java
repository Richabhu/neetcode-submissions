class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        dp(0, n, nums, new ArrayList<>(), res);
        return res;
    }

    public void dp(int i, int n , int nums[], List<Integer> curr, List<List<Integer>> res) {

        if(curr.size() == n) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int j = 0; j<n; j++) {
            if(curr.contains(nums[j]))
                continue;

            curr.add(nums[j]);
            dp(i+1, n, nums, curr, res);
            curr.removeLast();
        }
    }
}