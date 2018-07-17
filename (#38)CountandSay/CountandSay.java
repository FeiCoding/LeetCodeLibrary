class Solution {
    public String countAndSay(int n) {
        if(n < 1) return "";
        String res = "1";
        int i = 1;
        while(i < n){
            int count = 0;
            StringBuffer sb = new StringBuffer();
            char c = res.charAt(0);
            for(int j = 0; j <= res.length(); j ++){
                if(j != res.length() && res.charAt(j) == c){
                    count ++;
                }else{
                    sb.append(count);
                    sb.append(c);
                    if(j != res.length()){
                        c = res.charAt(j);
                        count = 1;
                    }
                }
            }
            res = sb.toString();
            i++;
        }
        return res;
    }
}