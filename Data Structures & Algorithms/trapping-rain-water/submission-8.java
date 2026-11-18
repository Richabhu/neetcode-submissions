class Solution {
    public int trap(int[] height) {
        int l = 0, r = 1;

        int sum = 0, s = 0;
        while(r < height.length) {
            if(height[r] < height[l]) {
                s += Math.abs(height[r] - height[l]);   
            }
            else {
                sum += s;
                s = 0;
                l = r;
            }
            r++;
        }


         // Re-process the unmatched tail from right to left                                        
          int end = l;
          l = height.length - 1;                                                                     
          r = l - 1;                                                                               
          s = 0;                                                                                     
          while (r >= end) {
              if (height[r] < height[l]) {                                                           
                  s += height[l] - height[r];                                                      
              } else {                                                                               
                  sum += s;
                  s = 0;                                                                             
                  l = r;                                                                           
              }
              r--;
          }
          sum += s;
          
        return sum;
    }
}
