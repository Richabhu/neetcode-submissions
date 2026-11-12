class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int c = 0;
        int l = 0, r = people.length - 1;
        while(l <= r) {
            if(people[l] + people[r] <= limit) {
                l++;
                r--;
            } else if(people[r] <= limit)
            {
                r--;
            } 
            else if(l+1 <= r && people[l] + people[l+1] <= limit) {
                l+=2;
            }
            else
                l++;
            c++;
        }
        return c;
    }
}