class Solution {
    public List<Integer> majorityElement(int[] nums) {
        /*

            5 2 3 2 2 2 2 5 5 5

            10 / 3 = 3

            count 

            e1, e2
            e1 = 5 , c = 
            e2 = 2 , c = 
        */
        
        List<Integer> res = new ArrayList<>();

        if(nums.length == 1) {
            res.add(nums[0]);
            return res;
        }
        
        // List<Integer> res = new ArrayList<>();
        int num1 = 0, c1 = 0;
        int num2 = 0, c2 = 0;

        for(int i = 0; i<nums.length; i++) {
            int ele = nums[i];

            if(ele == num1) {
                c1++;
            } else if(ele == num2) {
                c2++;
            } else if(c1 ==0) {
                num1 = ele;
                c1=1;
            } else if(c2 == 0)
            {
                num2 = ele;
                c2=1;
            }
            else {
                if(c1 < c2) {
                    c1--;
                } else
                    c2--;
                
                if(c1 <= 0) {
                    num1 = ele;
                    c1 = 1;
                } 
                else if(c2 <= 0) {
                    num2 = ele;
                    c2 = 1;
                }
            }
        }

        // pass 2
        int n = nums.length;
        n = (int)Math.floor(n/3);
        c1 = 0;
         c2= 0;
        for(int ele : nums) 
        {
            if(ele == num1)
                c1++;
            if(ele == num2)
                c2++;
        }
        if(c1 > n)
            res.add(num1);
        if(c2 > n)
            res.add(num2);
        
        return res;
    }
}