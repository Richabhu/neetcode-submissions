class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;

        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<=i+k && j<n; j++) {
                
                if( (nums[j] ^ nums[i]  ) == 0) {
                    System.out.println(i +" " + j + " " + (nums[i] & nums[j]) +" " + nums[i] +" " + nums[j]);
                    return true;
                }
                    
            }
        }
        return false;
    }
}