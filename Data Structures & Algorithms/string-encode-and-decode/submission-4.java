class Solution {

    public String encode(List<String> strs) {
        String delim = "\n";
        StringBuilder str = new StringBuilder();

        for(String s: strs) {

                str.append(s);
                str.append(delim);
            
            
        }
        // System.out.println(str);
        // if(str.length() > 1)
        //     return str.substring(0, str.length()-1);
        return str.toString();
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int l = 0;

        while(s.indexOf("\n", l) >= 0)
        {	
            int temp = s.indexOf("\n", l);
            res.add(s.substring(l,temp));
            l = temp+1;
        }
        // res.add(s.substring(l,s.length()));
        return res;

    }
}
