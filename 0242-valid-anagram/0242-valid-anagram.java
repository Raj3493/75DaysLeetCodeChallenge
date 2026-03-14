class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] count=new int[26];
        for(int j=0;j<s.length();j++){
            count[s.charAt(j)-'a']++;
            count[t.charAt(j)-'a']--;
        }

        for ( int v : count){
            if ( v != 0 ){
                return false;
            }
        }
        return true;
        


        // char[] chars=s.toCharArray();
        // char[] chart=t.toCharArray();
        // Arrays.sort(chars);
        // Arrays.sort(chart);
        // return Arrays.equals(chars,chart);


        
    }
}