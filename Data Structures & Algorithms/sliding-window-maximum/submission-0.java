class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []res = new int[nums.length - k + 1];

        PriorityQueue<Integer> que = new PriorityQueue<>((a,b) -> (b-a));
        Map<Integer, Integer> map = new HashMap<>();

        int r = 0;
        for(r = 0; r<k; r++) {
            if(!map.containsKey(nums[r])) {
                map.put(nums[r], 0);
                que.add(nums[r]);
            }
            map.put(nums[r], map.get(nums[r]) + 1);
        }

        int l = 0;
        int i = 0;
        for(r = k; r<nums.length; r++) {
            while(!(map.get(que.peek()) > 0)) {
                que.poll();
            }
            res[i++] = que.peek(); // 2
            map.put(nums[l], map.get(nums[l]) - 1);
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            if(map.get(nums[r]) == 1)
                que.add(nums[r]);
            l++;
        }
        while(!(map.get(que.peek()) > 0)) {
                que.poll();
            }
        res[i++] = que.peek();
        return res;
    }
}
