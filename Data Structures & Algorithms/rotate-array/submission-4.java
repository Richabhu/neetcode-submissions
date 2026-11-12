class Solution {
    public void rotate(int[] nums, int k) {

        

        k = k%nums.length;
        if(k == 0)
            return;
        
        if(nums.length == 1)
            return;

        int start = 0;
        int end = nums.length - 1;

        // for(int i = 0; i<k; i++) {
            
        //     swap(nums, start, end);
        //     end--;
        //     start++;
        // }

        // reverse arr
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0 , k-1);
        reverse(nums, k, nums.length-1);

    }

    public void reverse(int nums[], int start, int end) {
        // int start = k;
        // int end = ;
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
            
    }

    public void swap(int nums[], int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    // reverse
}