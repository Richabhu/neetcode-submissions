class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // if(k >= arr.length)
        //     return Arrays.asList(arr);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++) {
            int diff = Math.abs(arr[i] - x);
            map.put(arr[i], diff);
        }

        


        PriorityQueue<Integer> que = new PriorityQueue<>((a,b) ->  map.get(a).intValue() != map.get(b).intValue() ? map.get(a).intValue() - map.get(b).intValue() : a - b );
        for(int i = 0 ; i <arr.length; i++)
            que.add(arr[i]);

        /*
            300
            400
            200
            500
            100

        */

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i<k; i++)
            res.add(que.poll());


        Collections.sort(res);
        return res;
        
    }
}