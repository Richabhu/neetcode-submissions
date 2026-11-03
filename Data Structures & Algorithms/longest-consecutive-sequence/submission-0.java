class Solution {
    public int longestConsecutive(int[] nums) {
        /*

        [2,20,4,10,3,5,1, 0]


        left

        right
        2 -> while ( set.contains(num))
            num++

        num--;

        0 - 5 :
        */

        int c = 0;
        Set<Integer> set = new HashSet<>();
        for(int i: nums)
            set.add(i);

        for(int i = 0; i<nums.length; i++) {
            int n = nums[i];
            int l = n-1;
            while(set.contains(l)) {
                set.remove(l);
                l--;
                
            }
            l++; 

            int r = n+1;
            while(set.contains(r)) {
                 set.remove(r);
                r++;
               
            }
            r--;
            c = Math.max(c, r-l+1 );
        }
        return c;
    }
}
