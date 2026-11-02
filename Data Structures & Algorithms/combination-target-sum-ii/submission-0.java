class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
       
        dfs(0, candidates, target, new ArrayList<>(), res);
        return res;
    }

    public void dfs(int i, int candidates[], int target, List<Integer> curr, List<List<Integer>> res) {
        if(target == 0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0)
            return;

        if(i == candidates.length)
            return;


        for(int j = i; j<candidates.length; j++) {

            if( j > i && candidates[j] == candidates[j-1])
                continue;
            
            curr.add(candidates[j]);
    
            dfs(j+1, candidates, target - candidates[j], curr, res);
            curr.removeLast();
           
        }
    }
}