class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        // Map<Character,Integer> map = new HashMap<>();

        // for(char c : s.toCharArray()){
        //         map.put(c,map.getOrDefault(c,0)+1);
        // }
        // for(char c : t.toCharArray()){
        //         map.put(c,map.getOrDefault(c,0)-1);
        // }

        // for(int count : map.values()){
        //     if(count != 0){
        //         return false;
        //     }
        // }
        // return true;

        int[] freq = new int[26];

        for(char c : s.toCharArray()) freq[c - 'a']++;
        for(char c : t.toCharArray()) freq[c - 'a']--;

        for(int i =0 ; i < 26 ; i++) {
            if(freq[i] != 0) return false;
            }


        return true;
    }
}
