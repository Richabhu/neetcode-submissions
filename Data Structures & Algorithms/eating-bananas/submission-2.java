class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = getMax(piles);
        
        int low = min, high = max;
        while(low < high) {
            int mid = low + (high - low)/2; // 14
            // System.out.println(low +" " + high +" " + mid );
            int days = getTimeTakenToEat(piles, mid);
            // System.out.println(days);
            if(days > h) {
                low = mid + 1;  // 25 , 25      
            } else
                high = mid ; 

        }
        return high;

    }

    int getTimeTakenToEat(int piles[], int min) {
        int c = 0;
        for(int i = 0; i<piles.length; i++) {
            c += Math.ceil(piles[i] *1.0 / min);
        }
        return c;
    }

    

    public int getMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
            max = Math.max(max, arr[i]);
        return max;
    }
}
