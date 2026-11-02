class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, candidates.length, candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    public void dfs(int i, int n, int []candidates, int target, int currSum, List<Integer> curr, List<List<Integer>> res) {

        if(currSum == target) {
            res.add(new ArrayList<>(curr));
        }
         if(currSum > target) {
            return;
        }

        if(i == n)
            return;

        for(int j = i; j<n; j++) {
            curr.add(candidates[j]);
            dfs(j, n, candidates, target, currSum + candidates[j], curr, res);
            curr.removeLast();
        }
        
    }
}