class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        if(s.indexOf("IV") != -1) sum-=2;
        if(s.indexOf("IX") != -1) sum-=2;
        if(s.indexOf("XL") != -1) sum-=20;
        if(s.indexOf("XC") != -1) sum-=20;
        if(s.indexOf("CD") != -1) sum-=200;
        if(s.indexOf("CM") != -1) sum-=200;
    
        char ch[] = s.toCharArray();
        for(int count = 0; count < ch.length; count++){
            if(ch[count] == 'M') sum += 1000;
            if(ch[count] == 'D') sum += 500;
            if(ch[count] == 'C') sum += 100;
            if(ch[count] == 'L') sum += 50;
            if(ch[count] == 'X') sum += 10;
            if(ch[count] == 'V') sum += 5;
            if(ch[count] == 'I') sum += 1;
        }
        
        return sum;
    }
}