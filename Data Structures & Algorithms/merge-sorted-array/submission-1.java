class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n == 0)
            return;

        if(m == 0) {

            for(int i = 0; i<n; i++)
                nums1[i] = nums2[i];
            
            return;
        }

        for(int i = 0; i<m; i++) 
            nums1[m+n-1-i] = nums1[m-1-i];

        int i = n;
        int j = 0;

        display(nums1);

        int k = 0;
        while(k < m+n && i < m+n && j < n) {
            if(nums1[i] <= nums2[j]) {
                nums1[k] = nums1[i];
                i++;
                k++;
            }
            else {
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }

        if(i == m+n) 
        {
            while(j < n)
            {
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }

        
    }

    public void display(int arr[]) {
        for(int i = 0; i< arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
}