class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0)
            return "";

        StringBuilder str = new StringBuilder();
        for(String s: strs) {
            str.append(s.length());
            str.append("#");
            str.append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, j));
            res.add(str.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return res;
    }
}
