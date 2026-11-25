class Solution {
    public String minWindow(String s, String t) {
        
        if(t.length() > s.length())
            return "";

        // s="OUZODYXAZV"
        //  t="XYZ"

        Map<Character, Integer> tMap = getFreq(t); // x - 1 y -1 z -1
        int totalChar = tMap.size(); // 3
        
        int count = 0;
        int min = Integer.MAX_VALUE;
        String res = "";
        Map<Character, Integer> sMap = new HashMap<>();

        int l = 0; 
        int leftIndRes = 0;
        for(int r = 0; r<s.length(); r++) {

            char ch = s.charAt(r); // 0
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1); // O 2 U 1 Z1 D 1 Y 1 X 1 
        
            if(sMap.getOrDefault(ch, 0).equals(tMap.getOrDefault(ch, 0)))
            {
                count++;
            }
            
               
                // increase l to the first non  
                // "OUZODYX AZV"
             // r 6 l 1
            while(count == totalChar) {
                // System.out.println(count);
                

                if( (r-l+1) < min) { // min : 6, res = UZODYX
                    min = r-l+1;
                    
                    leftIndRes = l;
                }

                if(sMap.getOrDefault(s.charAt(l), 0).equals(tMap.getOrDefault(s.charAt(l), 0) ))
                {
                    count--;
                }
                sMap.put(s.charAt(l), sMap.get(s.charAt(l)) - 1);
                l++;
            }
                
               

            


        }
        if(min == Integer.MAX_VALUE)
            return "";
        res = s.substring(leftIndRes,leftIndRes+min);
        return res;
    }

    public Map<Character, Integer> getFreq(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
