class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        dfs(0, nums, new ArrayList<>(), res);
        return res;
    }

    void dfs(int i, int nums[], List<Integer> list, List<List<Integer>> res) {
        if(i == nums.length)
            return;

        for(int j = i; j< nums.length ; j++) {
            list.add(nums[j]);
            res.add(new ArrayList<>(list) );
            dfs(j+1, nums, list, res);
            list.removeLast();
        }
    }


}