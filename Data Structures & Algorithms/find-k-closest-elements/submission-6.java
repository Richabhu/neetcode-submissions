class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int pivot = getIndex(arr, x);
        int l = pivot, r = pivot +1;
        // System.out.println(l +" " + r);
      
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i<k; i++) {

            if(l < 0) {
                // res.add(arr[r]);
                r++;
            } else if(r == arr.length) {
                // res.add(arr[l]);
                l--;
            } else {


                int d1 = Math.abs(arr[l] - x);
                int d2 = Math.abs(arr[r] - x);


                if(d1 == d2) {
                    // res.add(arr[l]);
                    l--;
                } else if(d1 < d2) {
                    // res.add(arr[l]);
                    l--;
                } else
                {
                    // res.add(arr[r]);
                    r++;
                }
            }
           
        }
        System.out.println(l +" " + r);

        for(int i = l+1; i<r; i++)
            res.add(arr[i]);
        // Collections.sort(res);
        return res;
    }

    int getIndex(int arr[], int ele) {
        int low = 0, high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == ele)
                return mid;
            if(arr[mid] < ele)
                low = mid+1; 
            else
                high = mid - 1;//1
        }
        return low - 1; 
    }
}